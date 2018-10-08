//读入两个整数值，并显示加减乘除运算结果

package Chap02;

import java.util.Scanner;

public class ArithInt {
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);

        System.out.println("对x和y进行加减乘除运算。");

        System.out.print("请输入x的值：");
        int x=stdIn.nextInt();

        System.out.print("请输入y的值：");
        int y=stdIn.nextInt();

        System.out.println("x+y的结果是"+(x+y));
        System.out.println("x-y的结果是"+(x-y));
        System.out.println("x×y的结果是"+(x*y));
        System.out.println("x÷y的结果是"+(x/y));
        System.out.println("x÷y的余数是"+(x%y));        //显示x÷y的余数
    }
}
