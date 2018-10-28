package Chap04;

import java.util.Scanner;

//编写一段程序，与练习4-11相反，从0数到正整数值
public class HomeWork4_12 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入一个正整数，程序会从0开始数到该数：");
        int num = stdIn.nextInt();

        for (int i=0;i<=num;i++){
            System.out.print(i+" ");
        }
    }
}
