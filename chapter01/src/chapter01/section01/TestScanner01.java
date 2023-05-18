package chapter01.section01;

import java.util.Scanner;

/*

 */
public class TestScanner01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int a = sc.nextInt();
        System.out.println("您输入的数字为：" + a);
        System.out.println("请输入文本：");
        String str = sc.next();
        System.out.println("您输入的文本为：" + str);
        System.out.println("请输入数字：");
        int b = sc.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));


        System.out.println("======" + "输入三个数字求出最大值" + "=======");
        System.out.println("请输入第一个数字：");
        int int_a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int int_b = sc.nextInt();
        System.out.println("请输入第三个数字：");
        int int_c = sc.nextInt();
        int temp = int_a > int_b ? int_a : int_b;
        int max = temp > int_c ? temp : int_c;
        System.out.println("三个数字中最大的数字为：" + max);

    }
}
