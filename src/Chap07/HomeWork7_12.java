package Chap07;
//练习：编写方法rRotate、lRotate，分别返回整数x向右旋转n位后和向左旋转n位后的值
//int rRotate(int x,int n)
//int lRotate(int x,int n)
//所谓旋转，就是将最低位和最高位连起来进行移位。
//例如，当向右旋转5位时，必须将移位时移出的低5位放在高位上

import java.util.Scanner;

public class HomeWork7_12 {
    static int[] a = new int[32];
    static int[] r = new int[32];
    static int[] l = new int[32];
    //显示int型的位构成
    static void printBits(int x){
        for (int i=31;i>=0;i--){
            System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
        }
    }

    //向右旋转位数
    static void rRotate(int x,int n){
        for (int i=0;i<n;i++) {
            int t = r[31];
            r[31] = r[0];
            for (int j = 0; j < 30; j++) {
                r[j] = r[j + 1];
            }
            r[30] = t;
        }
    }

    //向左旋转位数
    static void lRotate(int x,int n){
        for (int i=0;i<n;i++) {
            int t = l[0];
            l[0] = l[31];
            for (int j =31; j > 1; j--) {
                l[j] = l[j - 1];
            }
            l[1] = t;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入整数：");
        int x = stdIn.nextInt();
        System.out.print("请输入旋转位数：");
        int n = stdIn.nextInt();

        for (int i=31;i>=0;i--){
            if ((x >>> i & 1) == 1)
                a[i]=1;
            else
                a[i]=0;
        }
        for (int i=0;i<32;i++){
            r[i]=a[i];
            l[i]=a[i];
        }

        System.out.print("整数" + x + "用位显示为："); printBits(x);
        System.out.println();
        System.out.print("整数" + x + "向右旋转"+n+"位后为：");rRotate(x,n);
        for (int i=31;i>=0;i--){
            System.out.print(r[i]);
        }
        System.out.println();
        System.out.print("整数" + x + "向左旋转"+n+"位后为：");lRotate(x,n);
        for (int i=31;i>=0;i--){
            System.out.print(l[i]);
        }
    }
}
