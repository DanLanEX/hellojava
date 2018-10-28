package Chap04;

import java.util.Scanner;

//请修改求季节的代码清单4-1，当读入的月份是1~12月以外的值时，提示再次输入（变成do语句中嵌入do语句的二重循环）
public class HomeWork4_19 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int retry;  //要重复一次吗
        int month;
        do {
            do {
                System.out.print("计算季节。\n请输入月份：");
                month = stdIn.nextInt();
            }while (month<1||month>12);


            if (month >= 3 && month <= 5)
                System.out.println("这是春天。");
            else if (month >= 6 && month <= 8)
                System.out.println("这是夏天");
            else if (month >= 9 && month <= 11)
                System.out.println("这是秋天");
            else if (month == 12 || month == 1 || month == 2)
                System.out.println("这是冬天");

            System.out.println("要重复一次吗？1...YES/0...NO");
            retry = stdIn.nextInt();

        } while (retry == 1);

    }
}
