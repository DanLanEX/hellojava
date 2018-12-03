package Chap06;

import java.util.Random;
import java.util.Scanner;

//练习：请编写一段英语单词学习程序，根据显示的星期，输入其英语表达。
//使用随机数生成星期作为题目。
//学习者可以根据个人意愿循环操作
//不连续出现同一个星期的题目
public class HomeWork6_15 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);


        String[] weekString = {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };

        while (true) {

                int week = rand.nextInt(6)+1;
                System.out.println("请问星期" + week + "用英语单词怎么表示？");
                while (true) {
                String answer = stdIn.next();

                if (answer.equals(weekString[week - 1]))break;
                System.out.println("回答错误");
            }


            System.out.println("回答正确，再来一次？（1...是 / 2...否）");
            int x = stdIn.nextInt();
            if (x == 2) break;
        }


    }
}
