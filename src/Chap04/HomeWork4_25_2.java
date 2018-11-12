package Chap04;

import java.util.Scanner;

//练习：请改写代码清单4-17和代码4-18的程序，不仅计算合计值，还计算平均值
public class HomeWork4_25_2 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("对整数进行加法运算。");
        System.out.print("要想加多少个整数：");
        int n = stdIn.nextInt();//要相加的数

        int sum = 0;//合计值
        for (int i=0;i<n;i++){
            System.out.print("整数：");
            int t = stdIn.nextInt();
            if (sum+t>1000){
                System.out.println("合计值超过了1000");
                System.out.println("最后一个数值被忽略。");
                break;
            }
            sum +=t;
        }
        System.out.println("合计值为"+sum+"。");
        System.out.println("合计值为"+sum/n+"。");
    }

}
