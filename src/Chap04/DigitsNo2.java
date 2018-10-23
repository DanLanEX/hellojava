package Chap04;//判断读入的值的位数（是否是2位以上）

import java.util.Scanner;

public class DigitsNo2 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入一个整数：");
        int n = stdIn.nextInt();

        if (n<-9||n>9)
            System.out.println("整数为2位或以上");
        else
            System.out.println("整数不是2位或以上");

    }

}
