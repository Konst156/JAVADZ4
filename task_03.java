import java.util.Stack;
import java.util.Scanner;

public class task_03 {
    public static void main(String[] args) {
        int res = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите операцию (+, -, *, /): ");
        String op = input.nextLine();
        System.out.print("Введите целое число a: ");
        int a = input.nextInt();
        System.out.print("Введите целое число b: ");
        int b = input.nextInt();
        Stack<Integer> stack = new Stack<>();
        if (op.equals("+"))     {res = a + b;}
        else if(op.equals("-")) {res = a - b;}
        else if(op.equals("*")) {res = a * b;}
        else if(op.equals("/")) {res = a / b;}
        else System.out.printf("Неверный ввод !");
        System.out.println("ответ:" + res);
        stack.push(res);
        while (true) {
            op = inputStr("\n> Введите оператор (+, -, *, /), " + 
            "\n> Либо ведите \"no\" для удаление последнего результата (oper или no) " +
            "\n либо введите \"stop\" для завершения работы");
            if (op.equals("stop")){
                System.out.println("Работа завершена");
                break;
            }
            
            if (op.equals("no")) {
                System.out.println("удаленное значение: " + stack.pop());
                res = stack.peek(); 
                System.out.println("Текущее значение: " + res);              
            }
            else {
                b = inputNum("Введите число: ");
                if (op.equals("+"))     {res = res + b;}
                else if(op.equals("-")) {res = res - b;}
                else if(op.equals("*")) {res = res * b;}
                else if(op.equals("/")) {res = res / b;}
                else System.out.printf("Неверный ввод !");
                stack.push(res);
                System.out.println("ответ = " + res);
            }
        }
    }
    public static int inputNum(String text)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print(text);
        int num = scan.nextInt();
        return num;
    }
    public static String inputStr(String text)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print(text);
        String str = scan.nextLine();
        return str;
    }
}
