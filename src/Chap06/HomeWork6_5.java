package Chap06;

import java.util.Scanner;

//练习：请编写一段程序，读入数组的元素个数和各个元素得值，并像图中那样显示各个元素的值。
//显示形式与初始值相同，即各个元素的值用逗号隔开，并用大括号括起来
public class HomeWork6_5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("请问数组需要创建多少个元素：");
		int x = stdIn.nextInt();
		int[] a = new int[x];

		for (int i = 0; i < x; i++) {
			System.out.print("请输入a[" + i + "]的值：");
			a[i] = stdIn.nextInt();
		}
		System.out.print("数组a={");
		for (int i = 0; i < x; i++) {
			System.out.print(a[i]);
			if (i + 1 < x)
				System.out.print(',');
		}
		System.out.print('}');
	}

}
