package Chap02;

import java.util.Scanner;

public class HomeWork2_10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("您的姓氏是：");
        String namea = stdIn.nextLine();

        System.out.print("您的名字是：");
        String nameb = stdIn.nextLine();

        System.out.println("您好"+namea+nameb+"先生");
    }
}
