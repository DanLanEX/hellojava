package Chap06;
//构成元素类型为int型的数组（构成元素个数为5：使用new来创建数组主体）
public class IntArray1 {

	public static void main(String[] args) {
		int[] a = new int[5];	//数组的声明
		
		a[1] = 37;				//将37赋给a[1]
		a[2] = 51;				//将51赋给a[2]
		a[4] = a[1] * 2;		//将74赋给a[4]

		//显示全部元素的值
		System.out.println("a[" + 0 + "] = " + a[0]);
		System.out.println("a[" + 0 + "] = " + a[1]);
		System.out.println("a[" + 0 + "] = " + a[2]);
		System.out.println("a[" + 0 + "] = " + a[3]);
		System.out.println("a[" + 0 + "] = " + a[4]);
	}

}
