//练习：请编写一段程序，读入一个正整数值，根据其除以3得到的值，分别显示“该值可以被3整除。”，“该值除以3余1。”，或“该值除以3余2”，当读入非正值时，显示“输入的不是正值。”

package Chap03;

import java.util.Scanner;

public class HomeWork3_7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入一个正整数：");
        int num = stdIn.nextInt();
        
        int z = num % 3;

        if (num<=0)
        System.out.println("输入的不是正值");
        else if (z==0)
            System.out.println("该值可以被3整除。");
        else
            System.out.println("该值除以3余"+z);

    }


}
