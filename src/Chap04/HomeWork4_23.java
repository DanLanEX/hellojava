package Chap04;

import java.util.Scanner;

//请编写一段程序，显示n层金字塔（图中示例是4层）
//第i行显示i%10
public class HomeWork4_23 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入要显示的层数n：");
        int n = stdIn.nextInt();

        for (int i=1;i<=n;i++){
            for (int x=1;x<=n-i;x++){
                System.out.print(" ");
            }
            for (int j=1;j<=(i-1)*2+1;j++){
                System.out.print(i);
            }
            System.out.println();
        }




    }
}
