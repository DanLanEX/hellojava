package Chap06;

import java.util.Scanner;

//第六章最终练习：编写一段程序，读入班级数、各班级的人数、全体的分数，计算总分和平均分。分别显示班级和全体的总分和平均分。
public class HomeWork6_19 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("请输入班级数：");
        int classnum = stdIn.nextInt();
        int[][] a = new int[classnum][];
        int[] b = new int[classnum];

        for (int i = 0; i < classnum; i++) {
            System.out.print("请输入" + (i + 1) + "班的人数:");
            int pep = stdIn.nextInt();
            a[i] = new int[pep];
            int sum=0;
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("请输入" + (i + 1) + "班" + (j + 1) + "号的分数：");
                int score = stdIn.nextInt();
                a[i][j]=score;
                sum+=a[i][j];
            }
            System.out.println();
            sum=b[i];
        }

        System.out.println("  班  |  总分  平均分  ");
        System.out.println("------+--------------");
        int sumex=0;
        for (int i=0;i<classnum;i++){
            System.out.print(" "+(i + 1) + "班  |  "+b[i]+"  ");
            System.out.printf("%3.1f",+(double)(b[i]/a[i].length));
            sumex+=b[i];
        }
        System.out.println("------+--------------");
        System.out.print(" 合计  |  "+sumex+"  ");
        System.out.printf("%3.1f",+(double)(sumex/classnum));
    }
}
