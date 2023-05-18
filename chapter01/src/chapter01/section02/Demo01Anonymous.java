package chapter01.section02;

public class Demo01Anonymous {
    public static void main(String[] args) {
        Person p = new Person();
        p.name ="张三";
        p.showName();

        System.out.println("======================");
        new Person().name ="赵又廷";
        new Person().showName();
    }
}
