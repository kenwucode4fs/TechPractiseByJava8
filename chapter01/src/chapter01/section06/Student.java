package chapter01.section06;

public class Student {

    private String name;
    private int age;
    private int id;
    static String classno;
    private static int idCounter = 0;

    static {
        System.out.println("静态代码块！当第一次用到本类的时候， 执行唯一一次。 主要用于一次性静态变量赋值！");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public Student() {
        this.id = ++idCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getClassno() {
        return classno;
    }

    public static void setClassno(String classno) {
        Student.classno = classno;
    }
}
