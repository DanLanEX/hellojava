package Chap04;

import java.util.Scanner;

//练习：编写一段程序，如图所示，显示1到n的整数值的平方
public class HomeWork4_18 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入整数：");
        int n = stdIn.nextInt();

        for (int i=1;i<=n;i++){
            System.out.println(i+"的平方是："+(i*i));
        }

    }
}
