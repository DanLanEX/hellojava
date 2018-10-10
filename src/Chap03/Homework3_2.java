//练习：读入两个整数，如果后一个是前一个的约数，则显示“B是A的约数”，否则显示“B不是A的约数”

package Chap03;

import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("请输入整数a：");
        int a = stdIn.nextInt();

        System.out.println("请输入整数a：");
        int b = stdIn.nextInt();

        if (a%b==0)
            System.out.println("B是A的约数");
        else
            System.out.println("B不是A的约数");
    }
}
