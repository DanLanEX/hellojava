//计算圆的周长和面积（其二：使用final变量来表示圆周率）

package Chap02;

import java.util.Scanner;

public class Circle2 {
    public static void main(String[] args) {

        final double PI = 3.1416;       //使用final变量定义圆周率

        Scanner stdIn = new Scanner(System.in);

        System.out.print("半径：");
        double r = stdIn.nextDouble();

        System.out.println("周长是"+2*PI*r+"。");
        System.out.println("面积是"+PI*r*r+"。");
    }

}
