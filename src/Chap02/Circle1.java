//计算圆的周长和面积（其一：使用浮点型常量来表示圆周率）

package Chap02;

import java.util.Scanner;

public class Circle1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("圆的半径是：");
        double r = stdIn.nextDouble();

        System.out.println("周长是"+2*3.14*r+"。");
        System.out.println("面积是"+3.14*r*r+"。");
    }
}
