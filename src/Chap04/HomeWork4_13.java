package Chap04;

import java.util.Scanner;

//请用for语句来实现计算1到n的和,的代码清单4-10
public class HomeWork4_13 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入整数，系统会计算1到这个数的总和：");
        int n = stdIn.nextInt();
        int sum=1;
        for (int i = 1;i<n;i++){
            sum=i+n;
        }
        System.out.print("1到n的总和是："+sum);

    }
}
