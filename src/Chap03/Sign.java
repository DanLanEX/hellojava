//判断输入的整数值的符号（正/负/0）并显示判断结果

package Chap03;

import java.util.Scanner;

public class Sign {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数：");
        int num = stdIn.nextInt();
        
        if (num>0)
            System.out.println("输入的整数大于0");
        else if (num<0)
            System.out.println("输入的整数小于0");
        else
            System.out.println("输入的整数等于0");

    }

}
