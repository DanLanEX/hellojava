package Chap04;//显示读入的两个整数值中较小的值（其一：if语句）


import java.util.Scanner;

public class Min2 {
public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("整数a：");
    int a = stdIn.nextInt();

    System.out.print("整数b：");
    int b = stdIn.nextInt();

    int min;

    if (a>b)
        min=b;
    else
        min=a;

    System.out.println("较小的值为"+min);

}
}
