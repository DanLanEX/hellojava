//练习：读入一个整数，并输出绝对值

package Chap03;

import java.util.Scanner;

public class Homework3_1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数：");
        int num = stdIn.nextInt();

//        if (num!=0)
            System.out.println("您输入的整数"+num+"的绝对值是"+-num);
/*
        else
            System.out.println("您输入的数为0，绝对值也为0");
*/

    }

}
