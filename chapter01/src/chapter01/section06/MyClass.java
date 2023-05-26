package chapter01.section06;

public class MyClass {

    static{
        System.out.println("第一次用到类的时候执行！静态代码块执行唯一的一次。");
    }
    public void method(){
        System.out.println("这是一个成员方法！");
    }

    public static void methodStatic(){
        System.out.println("这是一个静态方法");
    }
}
