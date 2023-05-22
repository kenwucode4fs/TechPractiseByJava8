package chapter01.section03;

import java.util.Random;

/**
 * 根据int变量n的值，获取所及数值【1，N】
 */
public class Demo02Random {
    public static void main(String[] args) {
        Random rc = new Random();
        System.out.println(rc.nextInt(10)); //  0～9
        int n =10;
        System.out.println(rc.nextInt(n)+1); // 1～N
    }
}
