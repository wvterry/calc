import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // инициаировали ввод с клавы
        System.out.println("Введите пример: ");
        String num = in.nextLine(); // создали переменную num, которая принимает ввод с клавы


        String[] num1 = num.split(" ");  // создали массив, назвали его num1 и сделали так, чтоб но всё разделял через пробел
        try{
            int a = Integer.parseInt(num1[0]);
        } catch (NumberFormatException e) {
            System.out.print("Вы ввели не число");
            System.exit(0);
        }
        int a = Integer.parseInt(num1[0]);
        int b = Integer.parseInt(num1[2]);

        String znak = num1[1];
        if(a>10 | a < 0 | b > 10| b < 0){
            System.out.println("Введено неверное число");
            System.exit(0);
        }

        if (znak.equals("+")) {
            System.out.println(a+b);

        }else if(znak.equals("-")) {
            System.out.println(a-b);
        }else if(znak.equals("*")) {
            System.out.println(a*b);
        }else if(znak.equals("/")) {
            try{
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                System.out.print("Делить на 0 нельзя, программа закрывается.");}
            }






    }
}
