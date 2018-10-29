package Chap04;

import java.util.Scanner;

//练习：编写一段程序，显示n层的金字塔（图中是4层的实例）。
//第i行显示(i-1)*2+1个'*'，最后一行，即第n行显示(n-1)*2+1个'*'。
public class HomeWork4_22 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入想显示的金字塔层数：");
        int n = stdIn.nextInt();

        for (int i=1;i<=n;i++){
            for (int x = 1; x <= n-i; x++) {
                System.out.print(" ");
            }
            for (int j=1;j<=(i-1)*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
