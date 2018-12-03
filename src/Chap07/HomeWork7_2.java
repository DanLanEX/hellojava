package Chap07;

import java.util.Scanner;

//练习：请编写方法min，计算3个int型参数a、b、c中的最小值。
public class HomeWork7_2 {
    static int min(int a,int b,int c){
        int min = a;
        if (b<min)
            min = b;
        if (c<min)
            min = c;
        return min;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a：");   int a = stdIn.nextInt();
        System.out.print("整数b：");   int b = stdIn.nextInt();
        System.out.print("整数c：");   int c = stdIn.nextInt();

        System.out.print("最小值是：" + min(a, b, c));
    }
}
