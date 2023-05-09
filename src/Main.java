import java.net.SocketOption;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
  //1 Задание
        // int b = 10;
        //int c = 5;
        //  int a = 4 * (b + c - 1) / 2;
        // System.out.println(a);

  //2 Задание(1)
        //public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        //  System.out.print("Введите число: ");
        //int y = input.nextInt();
        //  System.out.println("Сумма цифр равна: " + n(y));
        // }

        //  public static int n(int y) {
        //  int p = 0;
        // while (y != 0) {
        //   p += y % 10;
        //  y /= 10;
        // }
        // return p;
        //   }
  //Задание 2(2)
        //     int n = 46;
        //  int step = (n / 10 ) + (n % 10);
        //   System.out.println("Сумма цифр равна:" +step);

  //Задание 3

        //  int n = 155;
        // int step = ((n / 100)+(n % 10)+((n/10) % 10));
        //System.out.println("Сумма чисел ровна: " +step);
        //Задание 4
        // double n = 8.3;
        //  int step = (int)Math.round(n);
        //  System.out.println(result);
 //Задание 5
    int q = 16;
    int w = 3;
    int step1 = q / w;
    int step2 = q % w;
    System.out.println("Остаток чисел: "  +step1+ " и " +step2);

    }
}