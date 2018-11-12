package Chap05;
//练习：编写一段程序，以0.001为单位显示从0.0到1.0的值及其平方值。
public class HomeWork5_7 {
    public static void main(String[] args) {
        for (int x = 0;x<=1000; x++){
            double a = (double)x/1000;
            double b = a*a;
            System.out.printf("%4.3f    %4.3f\n",a,b);
        }
    }
}
