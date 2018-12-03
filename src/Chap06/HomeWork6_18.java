package Chap06;

import java.util.Scanner;

//改写代码清单6-18，通过键盘输入各行各列和各元素的值
public class HomeWork6_18 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("请输入行数：");
        int h = stdIn.nextInt();

        int[][] c;
        c = new int[h][];

        for (int i = 0; i < h; i++) {
            System.out.println("请输入第" + (i + 1) + "列数：");
            int w = stdIn.nextInt();
            c[i] = new int[w];
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.println("请输入c[" + i + "][" + j + "]的值：");
                int x = stdIn.nextInt();
                c[i][j] = x;
            }
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.printf("%3d", c[i][j]);
            }
            System.out.println();
        }
    }
}
