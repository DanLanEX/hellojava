package Chap04;//判断读入的整数值的位数（0/1位/2位以上）

import java.util.Scanner;

public class DigitsNo1 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入整数值：");
        int num = stdIn.nextInt();

        if (num==0)
            System.out.println("输入的是0");
        else if (num>=-9&&num<=9)
            System.out.println("输入的是1位数");
        else
            System.out.println("输入的是2位或以上的数");

    }

}
