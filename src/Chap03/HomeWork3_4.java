//练习：编写一个程序，读入变量a、b，并按一下内容提示他们之间的大小关系“a更大。”“b更大。”“a和b相等”

package Chap03;

import java.util.Scanner;

public class HomeWork3_4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入数字a：");
        double a = stdIn.nextDouble();
        
        System.out.print("请输入数字b：");
        double b = stdIn.nextDouble();
        
        if (a>b)
            System.out.println("a与b相比，a更大。");
        else if (a<b)
            System.out.println("a与b相比，b更大。");
        else
            System.out.println("a与b一样大。");
        
    }
}
