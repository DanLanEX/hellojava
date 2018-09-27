//输出自己名字，一行一个字符，姓名之间空开一行
package Chap01;

public class MyName2 {
    public static void main(String[] args){
        //方法一，换行符"\n"
        System.out.println("冯\n");
        System.out.println("振");
        System.out.println("海");

        //无实际意义，仅作换行
        System.out.println();
        System.out.println();
        System.out.println();

        //方法二，输出空行
        System.out.println("冯");
        System.out.println();
        System.out.println("振");
        System.out.println("海");
    }
}
