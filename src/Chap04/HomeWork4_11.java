package Chap04;
//����for�����ʵ�ֽ�������ֵ������0�Ĵ����嵥4-4��
import java.util.Scanner;

public class HomeWork4_11 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int n;

        do {
            System.out.print("������һ�������������򽫵�����0��");
            n = stdIn.nextInt();
        }while (n <= 0);

        for(int i=0;i<=n;i++){
            System.out.println(n-i);
        }
    }
}