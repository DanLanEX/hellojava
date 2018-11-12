package Chap05;

import java.util.Scanner;

// 计算两个整数值的实数平均值（使用造型运算符）
public class Average3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("计算整数值x和y的平均值。");
		System.out.print("x的值：");
		int x = stdIn.nextInt();
		System.out.print("y的值：");
		int y = stdIn.nextInt();
		
		double ave = (double)(x+y)/2;				//平均值
		System.out.println("x和y的平均值为"+ave+"。");	//显示
	}

}
