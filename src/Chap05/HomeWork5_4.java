package Chap05;

import java.util.Scanner;

//练习：请编写一段程序，显示读入的三个整数值的合计值和平均值。平均值用实数显示。
public class HomeWork5_4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("请输入三个数，程序将计算他们的平均数");
		int a=stdIn.nextInt();
		int b=stdIn.nextInt();
		int c=stdIn.nextInt();
		
		double ave=(a+b+c)/3.0;
		System.out.printf("三个数的平均值是%f", ave);

	}

}
