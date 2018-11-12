package Chap05;
//练习：编写一段程序，用八进制数和十六进制数来显示读入的十进制整数
import java.util.Scanner;

public class HomeWork5_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("请输入整数：");
		int n = stdIn.nextInt();
		
		System.out.printf("整数%d，八进制输出是%o，十六进制输出是%x", n,n,n);

	}

}
