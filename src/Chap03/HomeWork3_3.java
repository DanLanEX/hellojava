//

package Chap03;

import java.util.Scanner;

public class HomeWork3_3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数：");
        int num = stdIn.nextInt();

        if (num>0)
            System.out.println("输入的整数大于0");
        else if (num<0)
            System.out.println("输入的整数小于0");
        else if (num==0)
            System.out.println("输入的整数等于0");
    }
}
