package Chap04;
//��ʾ�������ֵ��
import java.util.Scanner;

public class PutAsteriskFor {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Ҫ��ʾ���ٸ�*�أ�");
        int n = stdIn.nextInt();

        for (int i = 0; i < n; i++)
            System.out.print('*');
        System.out.println();
    }
}