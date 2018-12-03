package Chap06;

import java.util.Random;
import java.util.Scanner;

//练习：编写一段程序，计算4行3列矩阵和3行4列矩阵的积。各个元素的值由键盘输入。
public class Home6_16 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        int[][] a = new int[4][3];
        int a0=1;
        int[][] b = new int[3][4];
        int b0=1;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("请输入数组a[" + i + "][" + j + "]的值：");
                a[i][j] = stdIn.nextInt();
                a0*=a[i][j];
                }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("请输入数组b[" + i + "][" + j + "]的值：");
                b[i][j] = stdIn.nextInt();
                b0*=b[i][j];
            }
        }

        System.out.print("数组a[][]的积是："+a0+"\n数组b[][]的积是："+b0);


    }
}
