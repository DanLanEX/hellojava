package Chap04;

import java.util.Scanner;

//显示所读入的数值个*（其二）
public class PutAsterisk2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("要显示多少个*呢：");
        int n = stdIn.nextInt();

        int i = 1;
        while (i <= n) {
            System.out.print('*');
            i++;
        }
        System.out.println();
    }
}
