package Chap07;

import java.util.Random;
import java.util.Scanner;

//请编写一段程序，对代码清单7-11进行扩展，随机提出下述的4个问题。
public class HomeWork7_10 {
    static Scanner stdIn = new Scanner(System.in);
    static Random rand = new Random();
    static int x, y, z;

    //确认是否继续
    static boolean confirmRetry() {
        int cont;
        do {
            System.out.print("再来一次？<Yes...1/No...0>:");
            cont = stdIn.nextInt();
        } while (cont != 0 && cont != 1);
        return cont == 1;
    }

    //问题1
    static void question1() {
        while (true) {
            System.out.print(x + "+" + y + "+" + z + "=");
            int k = stdIn.nextInt();                //读入的值
            if (k == x + y + z)                           //正确答案
                break;
            System.out.println("回答错误！！");
        }
    }

    //问题2
    static void question2() {
        while (true) {
            System.out.print(x + "+" + y + "-" + z + "=");
            int k = stdIn.nextInt();                //读入的值
            if (k == x + y - z)                           //正确答案
                break;
            System.out.println("回答错误！！");
        }
    }

    //问题3
    static void question3() {
        while (true) {
            System.out.print(x + "-" + y + "+" + z + "=");
            int k = stdIn.nextInt();                //读入的值
            if (k == x - y + z)                           //正确答案
                break;
            System.out.println("回答错误！！");
        }
    }

    //问题4
    static void question4() {

        while (true) {
            System.out.print(x + "-" + y + "-" + z + "=");
            int k = stdIn.nextInt();                //读入的值
            if (k == x - y - z)                           //正确答案
                break;
            System.out.println("回答错误！！");
        }
    }

    public static void main(String[] args) {

        System.out.println("心算能力训练！！");

        do {
            x = rand.nextInt(900) + 100;  //3位数
            y = rand.nextInt(900) + 100;  //3位数
            z = rand.nextInt(900) + 100;  //3位数
            int q = rand.nextInt(4);
            switch (q) {
                case 0:
                    question1();
                    break;
                case 1:
                    question2();
                    break;
                case 2:
                    question3();
                    break;
                case 3:
                    question4();
                    break;
            }
        } while (confirmRetry());
    }
}
