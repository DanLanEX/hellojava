package Chap06;

import java.util.Random;
import java.util.Scanner;

//练习：编写一段英语单词学习程序，根据显示的月份数值1~12，输入其英语表达。
//使用随机数生成星期作为题目
//学习者可以根据个人意愿循环操作
//不连续出现同一个月份的题目
//判断字符串s1和s2是否相等（所有的字符都相等）可以使用s1.equals(s2)
public class HomeWork6_14 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        String[] monthString = {                                //定义数组monthString为存储月份单词的字符串
                "January","February","March","April","May","June","July",
                "August","September","October","November","December"
        };
        while (true) {
        int month = rand.nextInt(11)+1;                   //目标月份：0~11的随机数
        System.out.println("题目是" + month+"月");                //出题目，为数字月份


            while (true) {                                           //无限循环，如果回答正确则退出，回答不正确则输出“回答错误”，并继续循环
                System.out.print(month+"月的英语单词是什么呢：");
                String m = stdIn.next();

                if (m.equals(monthString[month - 1])) break;
                System.out.println("回答错误");
            }
            System.out.println("回答正确，再来一次？（1...是 / 2...否）");
            int x = stdIn.nextInt();
            if (x==2) break;
        }
    }
}
