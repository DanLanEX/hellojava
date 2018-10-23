package Chap04;

import java.util.Scanner;

//练习：请分别改写代码清单4-7和代码清单4-8，如果读入的值小于1，则不输出换行符。
public class HomeWork4_6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请问想显示多少个星号（*）呢？");
        int x = stdIn.nextInt();

        int i=0;
        while(i<x){
            System.out.print('*');
            i++;
        }
        if (x>=1)
            System.out.println();


        System.out.print("请问想显示多少个星号（*）呢？");
        int y = stdIn.nextInt();
        i = 1;
        
        while (i<=y){
            System.out.print('*');
            i++;
        }
        if (y>=1)
        System.out.println();


    }
}
