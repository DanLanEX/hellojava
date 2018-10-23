package Chap04;
//请编写一段程序，读入正整数值，然后输出他的位数

import java.util.Scanner;

public class HomeWork4_8 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int num;
        do {
            System.out.print("请输入一个整数：");
            num = stdIn.nextInt();
        } while (num <= 0);

        int n = 0;

        do {
            num /= 10;
            n++;
        } while (num != 0);
        System.out.print("这个数的位数是" + n + "位");
    }
}
