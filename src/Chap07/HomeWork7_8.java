package Chap07;

import java.util.Random;
import java.util.Scanner;

//练习：请编写方法random，生成一个大于等于a且小于b的随机数，并返回该数值。
//要在该方法内部调用生成随机数的标准库（2-2节）
//如果b的值小于a，则直接返回a的值
public class HomeWork7_8 {
    static int random(int a, int b) {
        Random rand = new Random();
        if (b < a)
            return a;
        else {
            int x = rand.nextInt(b - a) + a;
            return x;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入a：");
        int a = stdIn.nextInt();

        System.out.println();

        System.out.print("请输入b：");
        int b = stdIn.nextInt();

        System.out.println("返回值为：" + random(a, b));
    }
}
