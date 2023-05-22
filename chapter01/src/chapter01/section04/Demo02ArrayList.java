package chapter01.section04;

import java.util.ArrayList;

public class Demo02ArrayList {
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<>();

        Person one = new Person("迪丽热巴", 20);
        Person two = new Person("张三", 21);
        Person three = new Person("李四", 22);

        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(three);

        System.out.println(arrayList.get(0).getName());
        System.out.println(arrayList.get(1).getName());
        System.out.println(arrayList.get(2).getName());

        for (int i = 0; i <arrayList.size() ; i++) {
            Person tmpp = arrayList.get(i);
//            System.out.println(tmpp.getName());
            System.out.println(tmpp.getAge());
        }


        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("赵丽颖");
        stringArrayList.add("古力娜扎");

        for (int i = 0; i <stringArrayList.size() ; i++) {
            String str = stringArrayList.get(i);
            System.out.println(str);
        }


    }
}
