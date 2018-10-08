//输入两个实数值，并显示加减乘除运算的结果

package Chap02;

import java.util.Scanner;

public class ArithDouble {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入x：");
        double x = stdIn.nextDouble();

        System.out.print("请输入y：");
        double y = stdIn.nextDouble();

        System.out.println("x+y的结果是"+(x+y));
        System.out.println("x-y的结果是"+(x-y));
        System.out.println("x×y的结果是"+(x*y));
        System.out.println("x÷y的结果是"+(x/y));
        System.out.println("x÷y的余数是"+(x%y));        //显示x÷y的余数

    }
}
