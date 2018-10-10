//如果读入的整数值为正值，则判断其为偶数还是奇数，并显示判断结果

package Chap03;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数：");
        int n = stdIn.nextInt();

        if (n>0)
            if (n%2==0)
                System.out.println("您输入的是偶数");
            else
                System.out.println("您输入的是奇数");
        else if (n<0)
            System.out.println("您输入的是负数");
        else
            System.out.println("您输入的是0");

    }
}
