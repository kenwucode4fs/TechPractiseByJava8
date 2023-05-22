package chapter01.section04;

import java.util.ArrayList;

public class Demo05ArrayListStudent {

    public static void main(String[] args) {

        ArrayList<Student> stu = new ArrayList<>();


        Student one = new Student("洪七公", 23, "1100001");
        Student two = new Student("洪七公2", 23, "1100002");
        Student three = new Student("洪七公3", 23, "1100003");

        stu.add(one);
        stu.add(two);
        stu.add(three);

        for (Student tmpstu : stu) {
            System.out.println(tmpstu.getName());
            System.out.println(tmpstu.getAge());
            System.out.println(tmpstu.getNo());
        }

        for (int i = 0; i < stu.size(); i++) {
            System.out.println(stu.get(i).getNo() + " —— " + stu.get(i).getName() + " —— " + stu.get(i).getAge());
        }
    }
}
