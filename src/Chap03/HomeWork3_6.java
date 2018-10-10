//练习：编写一段程序，读入一个正整数值，如果他是10的倍数，则显示“该值是10的倍数”，否则显示“该值不是10的倍数”，当读入非正值时，显示“输入的不是正值”

package Chap03;

import java.util.Scanner;

public class HomeWork3_6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("输入一个正整数：");
        int num = stdIn.nextInt();
        
        if (num<=0)
            System.out.println("输入的不是正值");
        else if (num%10==0)
            System.out.println("该值是10的倍数");
        else
            System.out.println("该值不是10的倍数");
        
    }
}
