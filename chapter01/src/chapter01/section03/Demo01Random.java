package chapter01.section03;

import java.util.Random;

public class Demo01Random {

    public static void main(String[] args) {
        Random rd = new Random();
        System.out.println("随机数是：" + rd.nextInt());

        System.out.println("随机数是：" + rd.nextInt(10));

        for (int i = 0; i < 100 ; i++) {
            int num = rd.nextInt(10);
            System.out.println(num);
        }
    }
}
