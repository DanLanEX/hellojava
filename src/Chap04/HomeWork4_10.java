package Chap04;
//��ϰ�����д�����嵥4-11���������ֵС��1ʱ��������з�
import java.util.Scanner;

public class HomeWork4_10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Ҫ��ʾ���ٸ�*�أ�");
        int n = stdIn.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print('*');
        }
        if (n>=1)
        System.out.println();
    }
}