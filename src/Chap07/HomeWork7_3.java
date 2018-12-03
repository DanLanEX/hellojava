package Chap07;

import java.util.Scanner;

//练习：请编写方法med，计算3个int型参数a,b,c中的中间值。
public class HomeWork7_3 {

    //中位数方法
    static int med(int a, int b, int c) {
        //最大值
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        //最小值
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        //中位数
        int med = a;
        int[] z = {a,b,c};
        for (int i=0;i<3;i++){
            if (min<z[i]&&z[i]<max)
                med=z[i];
        }
        return med;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a：");
        int a = stdIn.nextInt();
        System.out.print("整数b：");
        int b = stdIn.nextInt();
        System.out.print("整数c：");
        int c = stdIn.nextInt();

        System.out.print("中间值是：" + med(a, b, c));
    }

}
