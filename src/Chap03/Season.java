//显示读入的月份所处的季节
package Chap03;
        import java.util.Scanner;

public class Season {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("计算季节。\n请输入月份：");
        int month = stdIn.nextInt();

        if (month>=3&&month<=5)
            System.out.println("输入的月份是春天");
        else if (month>=6&&month<=8)
            System.out.println("输入的月份是夏天");
        else if (month>=9&&month<=11)
            System.out.println("输入的月份是秋天");
        else if (month==12||month==1||month==2)
            System.out.println("输入的月份是冬天");
        else
            System.out.println("输入错误，请输入正确月份");
    }
}