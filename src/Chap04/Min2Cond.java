package Chap04;//显示读入的两个整数值中较小的值（其二：条件运算符）
import java.util.Scanner;

public class Min2Cond {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a：");
        int a = stdIn.nextInt();

        System.out.print("整数b：");
        int b = stdIn.nextInt();

        int min;
        String x;
        if (a>b){
            min=b;
            x="b";}
        else{
            min=a;
            x="a";}

        System.out.println("较小的值为"+x+"="+min);

    }
}
