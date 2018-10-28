package Chap04;

import java.util.Scanner;

//请改写显示读入的数值个*的代码清单4-11，每显示5个就换行
public class HomeWork4_17 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要显示多少个*呢：");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print('*');
            if (i%5==0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
