package Chap04;

import java.util.Scanner;

//练习：编写一段程序，显示读入的数值个符号。*和+交叉显示
public class HomeWork4_7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请问想显示多少个符号（*+）呢？");
        int x = stdIn.nextInt();

        int i =1;

        while(i<=x){

            if (i<x) {
                System.out.print('*');
                i++;
                System.out.print('+');
                i++;
            }
            else if (i==x){
                System.out.print('*');
                i++;
            }

        }

    }
}
