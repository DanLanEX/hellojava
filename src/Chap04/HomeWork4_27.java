package Chap04;
//练习：编写一段程序，对代码清单4-3中猜数字游戏的玩家可以输入的次数进行限制。当在限制次数内未猜中时，显示正确答案，结束游戏。
import java.util.Random;
import java.util.Scanner;

public class HomeWork4_27 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        int no = rand.nextInt(100); //产生0~99的随机数

        System.out.println("猜数字游戏开始！！");
        System.out.println("请猜一个0~99的数字。");

        int x;
        int sum = 0;

        for (int i = 0; i != no; i = x) {
            System.out.print("是多少呢？");
            System.out.println("请输入数字：");
            x = stdIn.nextInt();
            sum += 1;

            if (sum == 5) {
                System.out.println("你已猜错5次，正答案是：" + no);
                break;
            } else if (x > no)
                System.out.println("比这个数字小哟");
            else if (x < no)
                System.out.println("比这个数字大哟");
            else
                System.out.println("恭喜亲，回答正确。赏你一巴掌。");
        }
    }
}
