package chapter01.section04;

import java.util.ArrayList;
import java.util.Random;

/**
 * 生成6个1-33的随机整数，添加到集合，并遍历集合。
 */
public class Demo04ArrayListBasic {

    public static void main(String[] args) {


//        byte Byte
//        short Short
//          int Integer
//        long Long
//        float Float
//        double Double
//          char Character
//            boolean Boolean


        ArrayList<Integer> list = new ArrayList<>();

        Random n = new Random();

        for (int i = 0; i < 6; i++) {
            int tmp = n.nextInt(33) + 1;
            list.add(tmp);
        }
        for (Integer number : list) {
            System.out.println(number);
        }

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
