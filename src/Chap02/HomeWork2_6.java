//计算三角形面积
package Chap02;

import java.util.Scanner;

public class HomeWork2_6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入三角形的高h：");
        double h = stdIn.nextDouble();

        System.out.print("请输入三角形的底a：");
        double a =stdIn.nextDouble();

        double s = a*h/2;

        System.out.println("三角形的面积为"+s);
    }
    
}
