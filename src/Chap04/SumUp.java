package Chap04;

import java.util.Scanner;

//计算1到n的和
public class SumUp {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("计算1到n的和");
        long n;
        do {
            System.out.print("n的值：");
            n = stdIn.nextLong();
        }while (n<=0);
        
        long sum = 0;
        long i = 1;
        
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println("1到"+n+"的和是"+sum+"。");
    }
    
}
