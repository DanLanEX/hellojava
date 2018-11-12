package Chap04;

import java.util.Scanner;

//练习：请改写代码清单4-19的程序，不仅计算合计值，还计算平均值。另外，读入的负数的个数要排除在计算平均值的分母之外
public class HomeWork4_26 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("对整数进行加法运算");
        System.out.print("要相加多少个整数：");
        int n = stdIn.nextInt();    //要相加的个数

        int sum = 0;    //合计值
        for (int i = 0;i<n;i++){
            System.out.print("整数：");
            int t = stdIn.nextInt();
            if (t<0){
                System.out.println("不对负值进行加法运算。");
                i=i-1;
                continue;
            }
            sum +=t;
        }
        System.out.println("合计值为"+sum+"。");
        System.out.println("平均值为"+sum/n+"。");
    }
}
