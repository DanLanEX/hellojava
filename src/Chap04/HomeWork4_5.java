package Chap04;
//练习：将4-5中x--改为--x
import java.util.Scanner;

public class HomeWork4_5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("倒数。");
        int x;

        do {
            System.out.print("正整数值：");
            x = stdIn.nextInt();

        } while (x <= 0);
        while (x >= 0) {
            System.out.println(--x);
        }
    }
}
