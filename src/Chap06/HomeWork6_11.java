package Chap06;

import java.util.Random;
import java.util.Scanner;

//练习：对6_9进行改进，使得元素的值都不相等，限定元素个数小于等于10。
public class HomeWork6_11 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		int n;
		do {
			System.out.print("元素个数：");
			n = stdIn.nextInt();
		} while (n > 10);
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = rand.nextInt(10) + 1;
			
			for(int x=0;x<n;x++){
				if (x<i&&a[x]==a[i]){
					i--;
					break;
				}
			}
		}
		for (int i : a) {
			System.out.print(i + ",");
		}

	}

}
