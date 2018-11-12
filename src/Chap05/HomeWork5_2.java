package Chap05;

import java.util.Scanner;

//练习：请编写一段程序，显示float型的变量和double型的变量中读入的值
public class HomeWork5_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("请输入单精度浮点float数f：");
		float f = stdIn.nextFloat();
		System.out.printf("单精度浮点float数f是"+ f);
		System.out.println();
		System.out.print("请输入双精度浮点double数d：");
		double d = stdIn.nextDouble();
		System.out.printf("双精度浮点double数d是"+ d);
	}

}
