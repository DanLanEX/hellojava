package Chap06;

import java.util.Scanner;

//练习：请编写一段程序，显示考试分数的总分、平均分、最高分、最低分。人数和分数通过键盘输入
public class HomeWork6_6 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("请输入学生人数：");
		int x = stdIn.nextInt();
		int[] a = new int[x];
		int sum = 0;

		for (int i = 0; i < x; i++) {
			System.out.print("请输入学号为" + (i + 1) + "号的学生的分数：");
			a[i] = stdIn.nextInt();
			sum += a[i];
		}
		int max = a[0];
		for (int i = 1; i < x; i++) {
			if (a[i] > max)
				max = a[i];
		}
		int min = a[0];
		for (int i = 1; i < x; i++) {
			if (a[i] < min)
				min = a[i];
		}
		System.out.print(x + "位学生的总分为：" + sum + "\n平均分为：" + ((double) sum / x)
				+ "\n最高分为：" + max + "\n最低分为：" + min);

	}

}
