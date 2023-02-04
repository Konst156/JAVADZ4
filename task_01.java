// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class task_01 {
  public static void main(String[] args) {
    List<Integer> numbers = new LinkedList<>();
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
      numbers.add(random.nextInt(100));
    }
    System.out.println("Original List: " + numbers);
    List<Integer> reversedList = reverseList(numbers);
    System.out.println("Reversed List: " + reversedList);
  }

  public static List<Integer> reverseList(List<Integer> list) {
    List<Integer> reversedList = new LinkedList<>();
    for (int i = list.size() - 1; i >= 0; i--) {
      reversedList.add(list.get(i));
    }
    return reversedList;
  }
}