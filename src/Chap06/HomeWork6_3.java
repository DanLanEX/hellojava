package Chap06;

//练习：编写一段程序，从头开始依次为元素类型为double型、元素个数为5的数组元素赋值1.1、2.2、3.3、4.4、5.5，并进行显示。
public class HomeWork6_3 {
    public static void main(String[] args) {
        double[] a = new double[5];
        int j = 0;
        for (int i = 1; i <= 5; i++) {
            a[j] = (double) i*11/10;
            j++;
        }
        for (int i=0;i<5;i++){
            System.out.println("a["+i+"]="+a[i]);
        }
    }
}
