package Chap06;

import java.util.Random;
import java.util.Scanner;

//练习：请编写一段程序，将数组中的元素随机排列（按随机顺序进行混合）
public class HomeWork6_12 {

	public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入数组元素个数");
        int n = stdIn.nextInt();
        int[] a=new int[n];

        for (int i=0;i<n;i++){
            a[i] = i+1;
        }

        for (int i:a){
            System.out.print(i+" ");
        }

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = rand.nextInt(n) + 1;

            for(int x=0;x<n;x++){
                if (x<i&&b[x]==b[i]){
                    i--;
                    break;
                }
            }
        }

        System.out.println();
        System.out.println("乱序排序后为");
        for (int i = 0; i < n; i++){
            System.out.print(a[b[i]-1]+" ");
        }


	}

}
