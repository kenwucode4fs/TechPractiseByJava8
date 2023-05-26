package chapter01.section05;

public class Demo07String {

    public static void main(String[] args) {

        String str1 = "Hello World!";
        String[] strArray = str1.split(" ");
        System.out.println(strArray.length);
        for (String str:strArray) {
            System.out.println(str);
        }

        String str2 = "AAAA.BBBB.CCCC";
        String[] strArray2 = str2.split("\\.");
        for (String tmp:strArray2) {
            System.out.println(tmp);
        }
    }
}
