package Chap05;
//练习：请编写一段程序，并排显示下面两种情形。
//*像代码5-9那样，float型变量以0.001为单位从0.0递增至1.0的情形
//*像代码5-10那样，int型变量从0递增到1000的值在除以1000的情形

public class HomeWork5_9 {
    public static void main(String[] args) {
        System.out.println("  float        int   ");
        System.out.println("---------------------");

        int y=0;

        for (float x = 0.0F; x <= 1.0F; x += 0.001F) {
            System.out.printf("%8.7f   ", x);

            double ff = (double) y / 1000;
            System.out.printf("%8.7f   \n", ff);
            y++;


        }
    }
}
