package chapter01.section04;

import java.util.ArrayList;

/**
 * 定义以指定格式打印集合的方法。
 * sout [10,20,30]
 * printArrayList(list) {10@20@30}
 */
public class Demo05ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("宋远桥");
        list.add("张无忌");
        list.add("张翠山");
        System.out.println(list);

        printArrayList(list);
    }


    public static void printArrayList(ArrayList<String> l) {
        System.out.print("{");
//        for (String str: l) {
//            System.out.print(str+"@");
//        }
        for (int i = 0; i < l.size(); i++) {
            if (i != l.size()-1) {
                System.out.print(l.get(i) + "@");
            } else {
                System.out.print(l.get(i));
            }
        }
        System.out.println("}");
    }
}
