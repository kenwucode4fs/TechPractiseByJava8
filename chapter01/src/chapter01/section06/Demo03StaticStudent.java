package chapter01.section06;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        Student.classno = "三年级二班";
        Student one = new Student("郭靖", 20);
        System.out.println("姓名："+ one.getName() +"， 年龄： "+one.getAge() + ", 班级："+Student.classno + ", 学号："+one.getId());
        Student two = new Student("黄蓉", 21);
        System.out.println("姓名："+ two.getName() +"， 年龄： "+two.getAge() + ", 班级："+Student.classno + ", 学号："+two.getId());


    }
}
