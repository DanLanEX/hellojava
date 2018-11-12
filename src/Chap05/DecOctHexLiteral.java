package Chap05;

//整数常量（十进制/八进制/十六进制）
public class DecOctHexLiteral {
	public static void main(String[] args) {
		int a = 13; //十进制数的13
		int b = 013; //八进制数的13
		int c = 0x13; //十六进制数的13

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		System.out.printf("a = %d\n", a);	//用十进制数表示
		System.out.printf("a = %o\n", a);	//用八进制数表示
		System.out.printf("a = %x\n", a);	//用十六进制数表示
	}
}