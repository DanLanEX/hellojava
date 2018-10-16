package Chap04;

//确认表达式的求职顺序是左-右
public class EvaluationOrder {
    public static void main(String[] args) {

        int a = 3;
        int x = (a++) * (2 + a);
        System.out.println("a=" + a);
        System.out.println("x=" + x);
    }
}
