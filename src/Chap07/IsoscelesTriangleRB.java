package Chap07;//显示直角在右下方的直角三角形

import java.util.Scanner;

class IsoscelesTriangleRB{

    //连续显示n个字符c//
    static void putChars(char c,int n){
    while (n-- > 0){
        System.out.print(c);
    }
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("显示直角在右下方的三角形。");
        System.out.print("层数");
        int n = stdIn.nextInt();

        for (int i = 1;i<=n;i++){
            putChars(' ',n-i);
            putChars('+',i);
            System.out.println();
        }
    }
}