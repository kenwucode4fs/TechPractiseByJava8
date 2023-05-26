package chapter01.section05;

public class Demo01String {
    public static void main(String[] args) {


        // 创建方式一、创建一个空白字符串， 不含任何内容。
        String str1 = new String();
        System.out.println("第一个字符串：" +str1);

        // 创建方式二、根据字符数组
        char[] charArray = {'A','B','C'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串：" + str2);

        // 创建方式三、根据字节数组
        byte[] byteArrag = {97,98,99};
        String str3 = new String(byteArrag);
        System.out.println("第三个字符串：" + str3);

        // 创建方式四、直接创建
        String str4 = "hello World!";
        System.out.println("第四个字符串："+str4);

    }

}
