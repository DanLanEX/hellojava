package Chap06;
//练习：请编写一段程序，从头开始依次为元素类型为int型、元素个数为5的数组元素赋值5、4、3、2、1，并进行显示
public class HomeWork6_2 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int j=0;
        for (int i=5;i>0;i--){

            a[j]=i;
            j++;
        }
        for (int i=0;i<5;i++){
            System.out.println("a["+i+"]="+a[i]);
        }
    }

}
