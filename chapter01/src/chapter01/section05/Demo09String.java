package chapter01.section05;

import java.util.Scanner;

/**
 * 键盘输入一个字符串， 并且统计其中各种字符出现的次数。
 * 种类有： 大写字母、小写字母、数字、其他
 */
public class Demo09String {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();

        System.out.println("您输入的字符串为：" + str);

        int countUpper = 0; // 大写字母
        int countLower = 0; // 小写字母
        int countNumber = 0; // 数字
        int countOther = 0; //其他

        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if ('A' <= c && c <= 'Z') {
                countUpper++;
            } else if ('a' <= c && c <= 'z') {
                countLower++;
            } else if ('0' <= c && c <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }
        System.out.println("您输入字符串中， 大写字母个数为：" + countUpper);
        System.out.println("您输入字符串中， 小写字母个数为：" + countLower);
        System.out.println("您输入字符串中， 数字个数为：" + countNumber);
        System.out.println("您输入字符串中， 其他字符个数为：" + countOther);

    }

}
