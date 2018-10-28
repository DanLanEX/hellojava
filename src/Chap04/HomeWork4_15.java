package Chap04;

import java.util.Scanner;

//请编写一段程序，显示身高和标准体重的对应表。显示的身高范围（开始值、结束值、增量）需要作为整数值读入。
//标准体重的计算公式为（身高-100）×0.9
public class HomeWork4_15 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("从多少cm开始：");
        int x = stdIn.nextInt();

        System.out.print("从多少cm结束：");
        int y = stdIn.nextInt();

        System.out.print("每次增量多少cm：");
        int z = stdIn.nextInt();

        System.out.println("身高  标准体重");

        for (int i=x;i<=y;i+=z){
            System.out.println((i)+"    "+((i-100)*0.9));
        }



    }
}
