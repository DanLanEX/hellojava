package Chap02;

public class SumAve1Test {
    public static void main(String[] args) {
        int x;                                          //x是int型变量
        int y;                                          //y是int型变量
        int z;

        x = 63;                                           //把63赋给x
        y = 18;                                           //把18赋给y
        z = 12;

        System.out.println("x的值是" + x + "。");              //显示x的值
        System.out.println("y的值是" + y + "。");              //显示y的值
        System.out.println("z的值是" + z +"。");               //显示z的值
        System.out.println("合计值是" + (x + y + z) + "。");       //显示合计值
        System.out.println("平均值是" + (x + y + z) / 3 + "。");   //显示平均值
    }
}