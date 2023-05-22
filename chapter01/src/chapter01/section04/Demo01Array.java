package chapter01.section04;

public class Demo01Array {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person one = new Person("迪丽热巴", 20);
        Person two = new Person("张三", 21);
        Person three = new Person("李四", 22);
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);
        System.out.println(array[0].getName());
        System.out.println(array[0].getAge());

        System.out.println(array[1]);
        System.out.println(array[1].getName());
        System.out.println(array[1].getAge());

        System.out.println(array[2]);
        System.out.println(array[2].getName());
        System.out.println(array[2].getAge());



    }
}
