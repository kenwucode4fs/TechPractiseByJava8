package chapter01.section05;

public class Demo03String {


    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        char[] charArray = {'H','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
        System.out.println("Hello".equals(str1));
        System.out.println("Hello".equals(str3));
        System.out.println("hello".equals(str1));
        System.out.println("hello".equals(str3));

        System.out.println("hello".equalsIgnoreCase(str1));
        System.out.println("hello".equalsIgnoreCase(str3));
        System.out.println(str1.length());
        System.out.println(charArray.length);
    }

}
