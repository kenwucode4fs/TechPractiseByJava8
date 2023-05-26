package chapter01.section06;

public class Demo02StaticMethod {
    public static void main(String[] args) {

        MyClass.methodStatic();
        MyClass mc = new MyClass();
        mc.method();
        mc.methodStatic();//不推荐
        myMethod();
    }

    public static void myMethod(){
        System.out.println("本类当中的方法！");
    }

}
