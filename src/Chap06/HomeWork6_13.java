package Chap06;

import java.util.Scanner;

//练习：编写一段程序，将数组a中的全部元素倒序复制到数组b中。，另外，可以假定这两个数组中的元素个数相同。
public class HomeWork6_13 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("元素个数：");
        int n = stdIn.nextInt();            //读入元素个数
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i=0;i<n;i++){              //数组a中读入数值
            System.out.print("a["+i+"] =");
            a[i]=stdIn.nextInt();
        }

        for (int i=0;i<n;i++){              //将数组a中的全部元素倒序复制到b中
            b[i]=a[n-i-1];
        }
        System.out.println("已经将a中的全部元素倒序复制到了b中。");
        for (int i = 0;i<n;i++){            //显示数组b
            System.out.println("b["+i+"] = " + b[i]);
        }
    }
}
