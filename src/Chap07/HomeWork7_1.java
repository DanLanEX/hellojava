package Chap07;
//练习：请编写方法signOf，如果接收的int型参数的值n为负，则返回-1，如果为0，则返回0，如果为正，返回1.

import java.util.Scanner;

public class HomeWork7_1 {

    static int signOf(int n){
        if (n<0)
            return -1;
        else if (n==0)
            return 0;
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入数字：");
        int n = stdIn.nextInt();
        System.out.print("返回值为：" + signOf(n));
    }

}
