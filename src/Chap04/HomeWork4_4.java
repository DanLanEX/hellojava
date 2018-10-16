package Chap04;

import java.util.Scanner;

//编写一段程序，确认在代码清单4-4中的while语句结束时x的值会变为-1
public class HomeWork4_4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("倒数到-1");
        int x;

        do {
            System.out.print("请输入一个正整数：");
            x = stdIn.nextInt();
        }   while(x<=0);

        while(x>=-1){
            System.out.println(x);
            x--;
        }

    }
}
