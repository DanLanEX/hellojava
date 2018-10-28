package Chap04;

import java.util.Scanner;

//请改写4-13中的程序，想图中这样显示“表达式”
public class HomeWork4_14 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入整数，系统会计算1到这个数的总和：");
        int n = stdIn.nextInt();
        int sum = 1;
        for (int i = 1; i < n; i++) {
            sum = i + n;
            if (i!=1)
            System.out.print(" + "+i);
            else
                System.out.print(i);
        }
        System.out.print(" = " + sum);
    }
}
