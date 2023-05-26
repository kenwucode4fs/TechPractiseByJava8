package chapter01.section05;

public class Demo04String {

    public static void main(String[] args) {
        String str1 = "alksjdalskdjklj";
        System.out.println(str1.length());
        String str2 = str1.concat("HelloWorld!");
        System.out.println(str2);
        System.out.println(str1);

        System.out.println(str1.charAt(1));
        System.out.println(str1.indexOf("alk"));
    }
}
