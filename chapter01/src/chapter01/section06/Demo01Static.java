package chapter01.section06;

public class Demo01Static {
    public static void main(String[] args) {
        Student stu1 = new Student("欧阳锋", 101);
        stu1.classno = "三年级一班";

        Student stu2 = new Student("洪七公", 100);

        System.out.println("姓名："+stu1.getName() + ", 年龄: "+stu1.getAge() + ", 班级："+stu1.classno + ", 学号: "+stu1.getId());
        System.out.println("姓名："+stu2.getName() + ", 年龄: "+stu2.getAge() + ", 班级："+stu2.classno + ", 学号: "+stu2.getId());

    }
}
