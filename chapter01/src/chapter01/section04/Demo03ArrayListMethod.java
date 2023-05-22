package chapter01.section04;

import java.util.ArrayList;

public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        // 添加元素 add
        // 获取元素 get
        // 删除元素 remove
        // 获取集合长度
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");

        boolean success = list.add("王五");
        System.out.println(success);

        System.out.println(list.size());

        System.out.println("第2号索引位置是： " + list.get(2));

        String returnstr = list.remove(1);
        System.out.println(returnstr);
        System.out.println(list.size());

        for (String i :list) {
            System.out.println(i);
        }

    }
}
