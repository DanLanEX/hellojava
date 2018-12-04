package Chap07;

import java.util.Scanner;

//练习：请编写方法printSeason，显示参数m所指定的月份的季节。如果m为3、4、5，则显示春天；
// 如果m为6、7、8，则显示夏天；如果m为9、10、11，则显示秋天；如果m为12、1、2，则显示冬天；
//如果为其他值，不显示任何内容。
public class HomeWork7_6 {
    static void printSeason(int m) {
        switch (m) {
            default:
                break;
            case 12:
            case 1:
            case 2:
                System.out.println(m + "月为冬天");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(m + "月为春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(m + "月为夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(m + "月为秋天");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("请输入月份，程序会给出季节");
        int m = stdIn.nextInt();

        printSeason(m);
    }
}
