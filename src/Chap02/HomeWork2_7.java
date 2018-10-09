//随机数练习1

package Chap02;

import java.util.Random;

public class HomeWork2_7 {
    public static void main(String[] args) {
        Random rand = new Random();

        int lucky1 = rand.nextInt(9);
        int lucky2 = rand.nextInt(9);
        int lucky3 = rand.nextInt(9);
        int lucky4 = rand.nextInt(9);

        //随机生成并显示一位数的正整数（1 ~ 9的值）
        System.out.println("随机生成并显示一位数的正整数（1 ~ 9的值）:"+(lucky1+1));

        //随机生成并显示一位数的负整数（-9 ~ -1的值）
        System.out.println("随机生成并显示一位数的正整数（-9 ~ -1的值）:"+-(lucky2+1));

        //随机生成并显示两位数的正整数（10 ~ 99的值）
        System.out.println("随机生成并显示一位数的正整数（10 ~ 99的值）:"+(lucky3+1)+lucky4);

    }
}
