//读入的整数值是0吗

package Chap03;

import java.util.Scanner;

public class Zero {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数值：");
        int n = stdIn.nextInt();
        
        if(!(n!=0))
            System.out.println("输入的值是0");
        else
            System.out.println("输入的值不是0");
    }
    
}
