package Chap05;

//从整型到浮点型的转换（丢失精度的示例）
public class IntegralToFloat {
    public static void main(String[] args) {
        int a = 123456789;
        long b = 1234567890123456789L;
        System.out.println("        a = " +         a);
        System.out.println("(float) a = " + (float) a);

        System.out.println("        b = " +         b);
        System.out.println("(double)b = " + (double)b);

    }

}
