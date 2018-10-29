package Chap04;

import java.util.Scanner;

//练习：请编写一段程序，判断读入的正整数值是否是质数。所谓质数，就是不可以被大于等于2且小于n中的任何一个数整除的整数n。
public class HomeWork4_24 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入一个正整数，系统会判断这个数是否为质数：");
        int n = stdIn.nextInt();
        int x = 1;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("此数不是质数");
                x = 0;
                break;
            }
        }
        if (x == 1)
            System.out.println("此数是质数");
    }
}
