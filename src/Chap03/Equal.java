//读入的两个整数值相等吗

package Chap03;

import java.util.Scanner;

public class Equal {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a：");
        int a = stdIn.nextInt();

        System.out.print("整数b：");
        int b = stdIn.nextInt();

        if (a == b)
            System.out.println("两个整数相等");
        else
            System.out.println("两个整数不相等");

        //或者用!=
/*        if (a!=b)
            System.out.println("两个整数不相等");
        else
            System.out.println("两个整数相等");*/
    }
}
