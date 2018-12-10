package Chap06;

import java.util.Scanner;

//第六章最终练习：编写一段程序，读入班级数、各班级的人数、全体的分数，计算总分和平均分。分别显示班级和全体的总分和平均分。
public class HomeWork6_19 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        //定义班级数，学生数，分数，分别为c,p
        int c,p;
        //读入班级数并生成数组
        System.out.print("请输入班级数：");
        c = stdIn.nextInt();
        int[][] a = new int[c][];

        int[] b = new int[c];       //各班总分的数组b[]

        int csum = 0;               //所有班级总分
        int cp = 0;                 //所有人数

        for(int i=0;i<c;i++){
            System.out.print("请输入"+(i+1)+"班的人数：");
            p = stdIn.nextInt();
            a[i]= new int[p];           //读入各班人数并制作数组
            cp += p;                    //所有人数计算
            for(int j=0;j<p;j++){
                System.out.print("请输入"+(i+1)+"班"+(j+1)+"号的分数：");
                a[i][j] = stdIn.nextInt();      //写入成绩到数组
                b[i] += a[i][j];                //计算各班总分数至数组b[]
            }
            csum += b[i];                       //计算所有班级总分
        }

        System.out.println("  班  |  总分  平均分  ");
        System.out.println("------+--------------");
        for (int i=0;i<c;i++){
            System.out.print(" "+(i + 1) + "班  |  "+b[i]+"  ");
            System.out.printf("%3.1f",(double)b[i]/a[i].length);        //输出各班级总分以及平均分，平均分输出为3位有效数字的浮点数
            System.out.println();
        }
        System.out.println("------+--------------");
        System.out.print("合计  |  "+csum+"  ");
        System.out.printf("%3.1f",(double)csum/cp);                     //输出所有班级总分以及平均分，平均分输出为3位有效数字的浮点数

    }
}
