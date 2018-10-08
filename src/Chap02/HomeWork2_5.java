//求两个实数的和与平均值

package Chap02;

import java.util.Scanner;

public class HomeWork2_5 {
    public static void main(String[] args) {
        Scanner stdIn= new Scanner(System.in);

        System.out.print("请输入x：");
        double x = stdIn.nextDouble();

        System.out.print("请输入y：");
        double y = stdIn.nextDouble();

        System.out.println("实数"+x+"和"+y+"的和是："+(x+y));
        System.out.println("实数"+x+"和"+y+"的平均值是："+(x+y)/2);
    }
}
