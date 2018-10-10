//判断读入的整数值的是否为正

package Chap03;

import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数值：");
        int num = stdIn.nextInt();
        
        if (num > 0)
            System.out.println("输入的整数值为正");

    }
}
