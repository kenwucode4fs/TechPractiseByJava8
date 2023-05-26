package chapter01.section05;

/**
 * 定义一个方法， 把数组{1,2,3}按照指定格式拼接成一个字符串，格式参照如下：[word1#word2#word3].
 */
public class Demo08String {
    public static void main(String[] args) {

        int[] array = {1,2,3};
        System.out.println(fromArrayToString(array));

    }

    public static String fromArrayToString(int[] intarray){
        String strStart = "[";
        String strEnd = "]";

        for (int i = 0; i < intarray.length ; i++) {
            if (i == intarray.length-1){
                strStart += "word" +intarray[i] + strEnd;
            }else {
                strStart += "word" + intarray[i] + "#";
            }
        }

        return strStart;
    }
}
