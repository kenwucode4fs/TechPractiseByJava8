package chapter01.section02;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = sc.nextInt();
        System.out.println("您输入的数字是：" +num);

        //匿名对象的方式
        System.out.println("匿名对象的方式——请输入第二个数字：");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("您输入的数字是：" +num1);

        //使用匿名对象来进行传参
        System.out.println("使用匿名对象来进行传参——请输入第三个数字：");
        methodPatam(new Scanner(System.in));

        //使用匿名对象来作为返回值
        System.out.println("使用匿名对象来作为返回值——请输入第四个数字：");
        int num4 = methodReturn().nextInt();
        System.out.println("您输入的数字是：" +num4);
    }

    public static void methodPatam(Scanner sc){
        int num2 = sc.nextInt();
        System.out.println("您输入的数字是：" +num2);
    }

    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
