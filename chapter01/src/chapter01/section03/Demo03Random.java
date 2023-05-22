package chapter01.section03;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字游戏
 */
public class Demo03Random {
    public static void main(String[] args) {

        //1、首先产生一个随机数字，并且一旦产生不再变化。 用Random的nextInt方法
        Random rc = new Random();
        int result = rc.nextInt(100)+1;

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你猜测的数字：");
        for (int i = 0; i <10 ; i++) {
            int guessNum = sc.nextInt();

            if (guessNum > result) {
                System.out.println("太大了， 请重试！");
            } else if(guessNum < result) {
                System.out.println("太小了， 请重试！");
            } else {
                System.out.println("恭喜你， 猜中了！");
                break;
            }
            if (i == 9){
                System.out.println("很遗憾， 您的10次机会已经使用完了！");
            }
        }

        System.out.println("游戏结束！");
    }
}
