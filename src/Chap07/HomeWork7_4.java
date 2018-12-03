package Chap07;

import java.util.Scanner;

//练习：编写一个方法，计算并返回1到n的所有整数的和
public class HomeWork7_4 {
    static int sumUp(int n){
        int sum=0;
        while (n-- > 0){
            sum += n+1;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入n：");
        int n = stdIn.nextInt();
        System.out.print("1到n的所有整数的和为：" + sumUp(n));
    }
}
