package Chap06;
//请编写一段程序，计算double型数组中全部元素的合计值和平均值。元素个数和全部元素的值都通过键盘输入。
import java.util.Scanner;
public class HomeWork6_8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("请输入数组a的元素个数：");
		int n = stdIn.nextInt();
		double[] a = new double[n];
		
		for (int i=0;i<n;i++){
			System.out.print("元素a["+i+"]的值为：");
			a[i]=stdIn.nextDouble();
		}
		
		double sum=0;
		for (double x:a){
			sum +=x;
		}
		
		double ave=sum/n;

		System.out.print("全部元素的合计值为："+sum+"，平均值为"+ave);
	}

}
