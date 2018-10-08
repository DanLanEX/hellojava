package Chap02;

import java.util.Scanner;

public class HomeWork2_4 {
    public static void main(String[] args){
        Scanner stdInt=new Scanner(System.in);

        System.out.print("请输入一个整数");
        int a=stdInt.nextInt();

        System.out.println("您输入的整数为"+a);
        System.out.println("您输入的整数"+a+"加上10后是"+(a+10));
        System.out.println("您输入的整数"+a+"减去10后是"+(a-10));

    }
}
