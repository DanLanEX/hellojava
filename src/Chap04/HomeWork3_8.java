package Chap04;/*练习：编写一段程序，根据通过键盘输入的分数来判断优/良/及格/不及格，并显示判断结果，判断标准如下。
0~59 不及格，60~59 及格，70~79 良，80~100 优。
*/

import java.util.Scanner;

public class HomeWork3_8 {
public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("请输入分数，程序会判断分数等级：");
    int num = stdIn.nextInt();

    if (num>=0&&num<=59)
        System.out.println("分数等级为不及格");
    else if (num>=60&&num<=69)
        System.out.println("分数等级为及格");
    else if (num>=70&&num<=79)
        System.out.println("分数等级为良");
    else if (num>=80&&num<=100)
        System.out.println("分数等级为优");
}

}
