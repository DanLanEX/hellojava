package Chap06;

import java.util.Scanner;

//编写一段程序，读入6名学生的2科（语文、数学）的成绩，并计算每科成绩的平均分和每名学生的平均分。
public class HomeWork6_17 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int[][] score = new int[6][2];
        int[] student =new int[6];
        int a = 0, b = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.print("请输入学生" + (i+1) + "的语文成绩：");
                    score[i][j]=stdIn.nextInt();
                    a += score[i][0];
                } else {
                    System.out.print("请输入学生" + (i+1) + "的数学成绩：");
                    score[i][j]=stdIn.nextInt();
                    b += score[i][1];
                }
            }
            student[i]=score[i][0]+score[i][1];
        }
        System.out.println("语文的平均分是：" + a / 6 + "\n数学的平均分是：" + b / 6);

        for (int i = 0; i < 6; i++) {
            System.out.println("学生"+(i+1)+"的平均分是:"+student[i]/2);
        }
    }
}
