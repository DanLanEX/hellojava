package Chap04;

import java.util.Scanner;

//请编写一段程序，如图所示，读入两个整数值，将位于这两个数值之间的所有整数（包括这两个数值）按从小到大的顺序显示出来
public class HomeWork4_3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("输入两个数，系统将会把他们之间的所有数字升序显示");

        System.out.print("请输入整数a：");
        int a = stdIn.nextInt();
        System.out.print("请输入整数b：");
        int b = stdIn.nextInt();
        int x=a;
        do {
            System.out.print(x+" ");
            x++;
        }while(x<=b);
        System.out.println();
        System.out.print("已显示完毕。");
    }
}
