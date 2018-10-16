package Chap04;
//根据输入的值显示对应的猜拳手势（只接受0、1、2）
import java.util.Scanner;

public class FingerFlashing {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int hand;

        do {
            System.out.print("请选择手势（0~石头、1~剪刀、2~布）：");
            hand = stdIn.nextInt();
            if (hand < 0 || hand > 2)
                System.out.println("输入有误，请重新输入。");
        } while (hand < 0 || hand > 2);

        switch (hand) {
            case 0:
                System.out.println("输入的是石头");
                break;
            case 1:
                System.out.println("输入的是剪刀");
                break;
            case 2:
                System.out.println("输入的是布");
                break;
        }


    }
}
