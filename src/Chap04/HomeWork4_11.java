package Chap04;
//请用for语句来实现将正整数值倒数到0的代码清单4-4
import java.util.Scanner;

public class HomeWork4_11 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int n;

        do {
            System.out.print("请输入一个数，程序会将他们倒数至0");
            n = stdIn.nextInt();
        }while (n <= 0);

        for(int i=0;i<=n;i++){
            System.out.println(n-i);
        }
    }
}