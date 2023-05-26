package chapter01.section05;

public class Demo06String {
    public static void main(String[] args) {

        String str1 = "aHello World";
        //toCharArray()， 将当前字符串拆分成为字符数组作为返回值。
        char[] chars = str1.toCharArray();
        System.out.println(chars[0]);

        //获得当前字符串底层的字节数组
        byte[] bytes = str1.getBytes();
        System.out.println(bytes[0]);

        //将所有出现的老字符串替换成为新的字符串。
        String str2 = str1.replace('o','*');
        System.out.println(str2);

    }
}
