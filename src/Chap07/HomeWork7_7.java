package Chap07;

import java.util.Scanner;

import static Chap07.IsoscelesTriangleRB.putChars;

//练习：请改写代码清单7-7中连续显示n个'*'的方法putStars，在其内部调用代码清单7-8中的方法putChars进行显示
public class HomeWork7_7 {
    static void putStars(int n){
        putChars('*',n);
    }
    static void putChars(char c,int n){
        while (n-- > 0){
            System.out.print(c);
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
