//随机生成并显示一个0-9的幸运数字

package Chap02;

import java.util.Random;

public class LuckyNo {
    public static void main(String[] args) {
        Random rand = new Random();

        int lucky = rand.nextInt(10);

        System.out.println("今天的新云数字是："+lucky+"。");

    }
}
