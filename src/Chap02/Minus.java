//读入整数值并显示对符号进行取反后的值

package Chap02;

import java.util.Scanner;

public class Minus {
    public static void main(String[] args){
        Scanner infoIn=new Scanner(System.in);

        System.out.print("请输入一个整数：");
        int a=infoIn.nextInt();

        int b=-a;
        System.out.println("整数"+a+"取反后的值为"+b);
    }

}
