package Chap06;

import java.util.Random;
import java.util.Scanner;

//练习：对6_99进行改进，使得连续元素的值不相等。
public class HomeWork6_10 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("元素个数：");
		int n = stdIn.nextInt();
		int[] a=new int[n];

		for(int i=0;i<n;i++){
			a[i]=rand.nextInt(10)+1;
			
			if (i>0&&a[i]==a[i-1]){
				i--;
			
			}
		}
		for(int i:a){
			System.out.print(i+",");
		}

	}

}
