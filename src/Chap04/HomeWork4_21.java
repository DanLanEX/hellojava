package Chap04;

import java.util.Scanner;

//代码清单4-16的程序显示了直角在左下方的直角三角形。请分别编写显示直角在左下方、右下方、右上方的直角三角形程序。
public class HomeWork4_21 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("分别显示直角在左上方，左下方，右上方，右下方的直角三角形");
        System.out.print("层数：");
        int n = stdIn.nextInt();

        //直角在左上方
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //直角在左下方
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //直角在右上方
        for (int i = 1; i <= n; i++) {
            for (int x = 2; x <= i; x++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {

                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //直角在右下方
        for (int i = n; i >= 1; i--) {
            for (int x = 1; x < i; x++) {
                System.out.print(" ");
            }
            for (int j = n+1; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }
}
