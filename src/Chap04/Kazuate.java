package Chap04;

import java.util.Random;
import java.util.Scanner;

//猜数字游戏（目标数字范围0~99）
public class Kazuate {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        int no = rand.nextInt(100); //产生0~99的随机数

        System.out.println("猜数字游戏开始！！");
        System.out.println("请猜一个0~99的数字。");

        int x;
        do {
            System.out.print("是多少呢？");
            x = stdIn.nextInt();
            
            if(x>no)
                System.out.println("比这个数字小哟");
            else if (x<no)
                System.out.println("比这个数字大哟");
            
        }while (x!=no);
        System.out.println("恭喜亲，回答正确。上你一巴掌。");


    }
}
