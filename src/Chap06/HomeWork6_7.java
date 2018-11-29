package Chap06;
//练习：代码清单6-9的程序在存在多个与要查找的键值相同的元素时，找到的是最开头的元素。请编写一段程序，将其修改为找到的是最末尾的元素。
import java.util.Random;
import java.util.Scanner;

public class HomeWork6_7 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		final int n = 12;		//元素个数
		int[] a = new int[n];
		
		for (int j = 0;j<n;j++)
			a[j] = rand.nextInt(10);
		
		
		System.out.print("数组a中全部元素的值\n{");
		for(int j=0;j<n;j++)
			System.out.print(a[j]+" ");
		System.out.print("}");
		
		System.out.print("要查找的数值：");
		int key = stdIn.nextInt();
		
		int i;
		for(i=n-1;i>-1;i--)
			if(a[i]==key)
				break;
		if(i<n)
			System.out.println("该元素是a["+i+"]。");
		else
			System.out.print("该元素不存在。");
	}

}
