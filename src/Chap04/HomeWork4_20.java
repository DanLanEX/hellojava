package Chap04;

import java.util.Scanner;

//请编写一段程序，显示n层正方形。图中所示为n时的运行结果。
public class HomeWork4_20 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入要显示正方形的n：");
        int n = stdIn.nextInt();
        
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
