package chapter01.section04;

import java.util.ArrayList;
import java.util.Random;

/**
 * 用一个大集合存入20个随机数字， 然后筛选其中的偶数元素，放到小集合当中
 */
public class Demo06ArrayListReturn {
    public static void main(String[] args) {

        Random rc = new Random();
        ArrayList<Integer> listBig = new ArrayList<>();
        int num = 0;
        for (int i = 0; i < 20; i++) {
            num = rc.nextInt(100) + 1;
            listBig.add(num);
        }

        for (Integer no : getSmallList(listBig)) {
            System.out.println(no);
        }
    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> Biglist) {
        ArrayList<Integer> listSmall = new ArrayList<>();

        for (Integer number : Biglist) {
            if (number % 2 == 0) {
                listSmall.add(number);
            }
        }

        return listSmall;
    }
}
