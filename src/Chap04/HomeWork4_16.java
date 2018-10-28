package Chap04;

import java.util.Scanner;

//请改写显示读入的整数值的所有约数的代码清单4-13，在显示完约数之后，显示约数的个数。
public class HomeWork4_16 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入一个正整数：");
        int n = stdIn.nextInt();
        int num=0;
        
        for(int i =1;i<=n;i++){
            if (n%i==0) {
                System.out.println(i);
                num++;
            }
        }
        System.out.println("这个正整数共有"+num+"个约数");
    }
}
