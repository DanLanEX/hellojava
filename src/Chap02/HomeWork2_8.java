//随机数练习2

package Chap02;

import java.util.Scanner;
import java.util.Random;

public class HomeWork2_8 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("请输入一个整数，并按回车确认，程序会产生出此数+-5范围内的随机数");
        int sum = stdIn.nextInt();
        int random = rand.nextInt(11);

        System.out.println("整数"+sum+"产生的随机数为："+(sum+(random-5)));
    }
}
