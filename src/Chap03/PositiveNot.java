////判断读入的整数值的正负

package Chap03;

import java.util.Scanner;

public class PositiveNot {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数值：");
        int num = stdIn.nextInt();
        
        if (num>0)
            System.out.println("您输入的数为正值");
        else
            System.out.println("您输入的数为负值");

    }
}
