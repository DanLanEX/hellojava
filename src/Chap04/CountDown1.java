package Chap04;
//从某一整数值倒数到0

import java.util.Scanner;

public class CountDown1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("倒数。");
        int x;

        do {
            System.out.print("正整数值：");
            x = stdIn.nextInt();

        }   while (x <= 0);
        while (x >= 0){
            System.out.println(x);
            x--;
        }

    }

}
