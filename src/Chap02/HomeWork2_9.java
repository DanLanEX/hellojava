//随机数练习3

package Chap02;

import java.util.Random;

public class HomeWork2_9 {
    public static void main(String[] args) {
        Random rand = new Random();

        int luckyint = rand.nextInt(11);
        double luckydou = rand.nextDouble();

        //随机生成的并显示0.0≤n＜1.0的实数值
        System.out.println("随机生成的并显示0.0≤n＜1.0的实数值：");
        System.out.println(luckydou);

        //随机生成的并显示0.0≤n＜1.0的实数值
        System.out.println("随机生成的并显示0.0≤n＜10.0的实数值：");
        System.out.println(luckyint+luckydou);

        //随机生成的并显示-1.0≤n＜1.0的实数值
        System.out.println("随机生成的并显示-1.0≤n＜1.0的实数值：");
        System.out.println(luckydou-1);
    }
}
