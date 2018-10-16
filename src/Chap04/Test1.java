package Chap04;

public class Test1 {
    public static void main(String[] args) {

        int x = 0, y = 0, z = 5, zz = 5;
        System.out.println(z);
        System.out.println(x);
        System.out.println(y);
        System.out.println();

        int i = 5;
        i = i + 1;
        System.out.println(i);
        System.out.println();

        int ii = 5;
        ii++;
        System.out.println(ii);
        System.out.println();

        int iii = 5;
        ++iii;
        System.out.println(iii);
        System.out.println();

        x = z++;
        y = ++zz;
        System.out.println(z);
        System.out.println(x);
        System.out.println(y);
        System.out.println();
    }


}
