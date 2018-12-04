package Chap07;

import java.util.Scanner;

//练习：请编写方法readPlusInt，在显示出“正整数值：”之后，通过键盘输入正整数值，并返回该数值。如果输入0或负值，则提示再次输入。
// 例如，如果是在下面的示例中，则方法readPlusInt会返回15.
public class HomeWork7_9 {
    static int readPlusInt(){
        Scanner stdIn = new Scanner(System.in);
        int n;
        do {
            System.out.print("正整数值：");
            n = stdIn.nextInt();
        } while (n==0||n<0);
        return n;
    }
    public static void main(String[] args) {
        System.out.println(readPlusInt());
    }
}
