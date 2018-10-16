package Chap04;

import java.util.Scanner;

//练习：编写一段程序，判断读入的整数值的符号（正/负/0）并显示判断结果，注意可以按照我们的意愿任意循环输入整数值并显示整数值的符号
public class HomeWork4_1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int retry;

        do {
            System.out.println("输入整数：");
            int num = stdIn.nextInt();

            if (num > 0)
                System.out.println("整数为正");
            else if (num < 0)
                System.out.println("整数为负");
            else
                System.out.println("整数为0");

            System.out.println("请问要继续判断吗？（1/0）");
            retry = stdIn.nextInt();
        } while (retry == 1);


    }
}
