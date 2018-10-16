package Chap04;

import java.util.Random;
import java.util.Scanner;

//请编写一个“猜数字游戏”，目标数字为2位的整数值（10~99）
public class HomeWork4_2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();
        
        int randnum = rand.nextInt(90);
        randnum = randnum+10;

        int num;

        System.out.println("欢迎来到猜数字游戏");

        do {
            System.out.println("数字已生成，请猜一个数：");
            num = stdIn.nextInt();
            
            if (num>randnum)
                System.out.println("比这个数字小哦，请再猜一遍：");
            else if (num<randnum)
                System.out.println("比这个数字大哦，请再猜一遍：");
        }while (num!=randnum);

        System.out.println("恭喜猜对啦，正是数字：" + randnum);
    }
}
