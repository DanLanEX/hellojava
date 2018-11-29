package Chap06;

import java.util.Random;
import java.util.Scanner;

public class HomeWork6_9 {
//练习：编写一段程序，创建一个元素类型为int型的数组，将1~10的随机数赋给数组的全部元素（赋入大于等于1，小于等于10的数值）。元素个数通过键盘输入。
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("元素个数：");
		int n = stdIn.nextInt();
		int[] a=new int[n];

		for(int i=0;i<n;i++){
			a[i]=rand.nextInt(10)+1;
		}
		for(int i:a){
			System.out.print(i+",");
		}
	}

}
