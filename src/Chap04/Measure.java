package Chap04;//��ʾ���������ֵ������Լ��
import java.util.Scanner;
public class Measure{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("����ֵ��");
        int n = stdIn.nextInt();

        for(int i =1;i<=n;i++){
            if (n%i==0)
            System.out.println(i);
        }
    }
}