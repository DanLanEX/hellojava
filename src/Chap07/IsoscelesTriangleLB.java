package Chap07;

import java.util.Scanner;

//显示直角在左下方的直角三角形
public class IsoscelesTriangleLB {
    static void putStars(int n){
        while (n-- > 0){
            System.out.print('*');
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("显示直角在左下方的三角形。");
        System.out.print("层数：");
        int n = stdIn.nextInt();
        
        for (int i = 1;i<=n;i++){
            putStars(i);
            System.out.println();
        }
    }
}
