//求两个整数值57和32的和并显示结果
package Chap02;

public class Sum2 {
    public static void main(String[] args) {
        //(57 + 32)括号内优先执行
        //"字符串+数值"或"数值+字符串"，会先将数值转换为字符串再进行拼接
        System.out.println("57 + 32 = " + (57 + 32));
    }
}
