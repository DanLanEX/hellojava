//读入姓名并打招呼（其一：next()版本）

package Chap02;

import java.util.Scanner;

public class HelloNext {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("您的姓名是：");
        String s = stdIn.next();        //读入字符串

        System.out.println("你好，"+s+"先生。");


    }

}
