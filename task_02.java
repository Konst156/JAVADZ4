// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Scanner;

public class task_02 {  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> linList = new LinkedList<>();
        linList.add(1); linList.add(2); linList.add(3);
        System.out.println(linList);
        System.out.println("Выберите порядковый номер одной из команд для работы со списком:");
        System.out.println("1) enqueue - помещает элемент в конец очереди");
        System.out.println("2) dequeue - возвращает первый элемент из очереди и удаляет его");
        System.out.println("3) first - возвращает первый элемент из очереди, не удаляя");
        String command = input.nextLine();
        // input.close();
        if (command.equals("1")){
            System.out.println("Введите элемент, который нужно поместить в конец очереди: ");
            Integer elem = input.nextInt();
            enqueue(linList, elem);
        }
        if (command.equals("2")){
            dequeue(linList);
        }
        if (command.equals("3")){
            first(linList);
        }
        input.close();
    }
    public static LinkedList<Integer> enqueue (LinkedList<Integer> list, int num) {
        list.addLast(num);
        System.out.println(list);   
        return list;
    } 
    public static int dequeue (LinkedList<Integer> list) {
        int temp = list.get(0);
        list.remove(0);
        System.out.println(temp);
        System.out.println(list);
        return temp;
    } 
    public static int first (LinkedList<Integer> list) {
        System.out.println(list.get(0));
        System.out.println(list);
        return list.get(0);
    }
}
