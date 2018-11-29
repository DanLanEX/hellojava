package Chap06;

import java.util.Random;
import java.util.Scanner;

//练习：请编写一段程序，改写代码清单6-5，想图中那样显示为纵向柱形图。
//最下面一行显示索引除以10的余数。
public class HomeWork6_4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("元素个数：");
		int n = stdIn.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = 1 + rand.nextInt(10);
		}

		for (int i = 10; i >= -1; i--) {
			for (int j = 0; j <= n * 2 - 1 - 1; j++) {
				if (i == 0) {
					System.out.print('-');
					continue;
				}

				else if (i == -1) {
					if (j == 0)
						System.out.print(j % 10);
					else if (j % 2 == 0)
						System.out.print((j + 1) / 2 % 10);
					else
						System.out.print(' ');

					continue;
				}

				else if (i != 0 && i != -1) {
					if (j == 0)
						if (a[j] % i == a[j])
							System.out.print(' ');
						else
							System.out.print('*');

					else if (j % 2 == 0)
						if (a[(j + 1) / 2] % i == a[(j + 1) / 2])
							System.out.print(' ');
						else
							System.out.print('*');

					else if (j % 2 != 0)
						System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
}