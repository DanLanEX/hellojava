package Chap04;

import java.util.Scanner;

//练习：编写一段程序，读入正整数n，然后计算1到n的积
public class HomeWork4_9 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("请输入一个正整数n，程序将输出1到n的乘积");
        long n;

        do {
            System.out.print("正整数：");
            n = stdIn.nextLong();
        }while(n<=0);

        long i = 2;
        long num = 1;
        while (i<=n){
            num *= i;
            i++;
        }
        System.out.println("1到n乘积是"+num);


    }
}
