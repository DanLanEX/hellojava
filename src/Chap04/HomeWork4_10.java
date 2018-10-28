package Chap04;
//改写代码4-11，当读入的值小于1时不输出换行符
import java.util.Scanner;

public class HomeWork4_10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请问想输出多少个*呢？");
        int n = stdIn.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print('*');
        }
        if (n>=1)
        System.out.println();
    }
}