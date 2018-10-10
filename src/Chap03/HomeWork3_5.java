//练习：编写一个正整数如果可以被5整除，则显示“该值可以被5整除。”，否则则显示“该值不可以被5整除。”当读入非正值时，显示“输入的不是正值”。

package Chap03;

import java.util.Scanner;

public class HomeWork3_5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入整数：");
        int num = stdIn.nextInt();
        
        if (num<=0)
            System.out.println("输入的不是正值");
        else if (num%5==0)
            System.out.println("该值可以被5整除。");
        else
            System.out.println("该值不可以被5整除。");
        
    }
}
