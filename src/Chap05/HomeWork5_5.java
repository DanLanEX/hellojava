package Chap05;
//编写一段程序，显示读入的三个整数值的合计值和平均值。使用造型运算符计算平均值，用实数显示。
import java.util.Scanner;
public class HomeWork5_5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("请输入三个整数，程序将计算合计值和平均值：");
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		float sum = (float)a+b+c;
		double ave = (double)sum/3;
		System.out.printf("三个整数合计值为%f，平均值为%f",sum,ave);
	}

}
