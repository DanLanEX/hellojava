package Chap07;

import java.util.Scanner;

//练习：编写一段程序，确认将整数左移和右移后的值与乘以和除以2的指数幂后的值相等
public class HomeWork7_11 {
    //2的指数幂
    static int c(int y){
        int c = 1;
        for (int i=0;i<y;i++){
            c *= 2;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入整数：");
        int x = stdIn.nextInt();
        System.out.print("请输入移位位数：");
        int y = stdIn.nextInt();

        System.out.println("x<<="+(x<<y)+"，x*2的"+y+"次幂="+x*c(y));
        System.out.println("x>>="+(x>>y)+"，x/2的"+y+"次幂="+x/c(y));
        System.out.print("整数左移和右移后的值与乘以和除以2的指数幂后的值相等");
    }
}
