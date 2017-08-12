package equals;

/**
 * Created by PH on 2017/8/12.
 */
public class StringTest {
    public static void main(String [] args){
        String s1 = new String ("123");
        String s2 = new String ("123");
        System.out.println(s1==s2);          //false
        System.out.println(s1.equals(s2));  //true
    }
}
 /*== 判断两个对象的引用是否相等
equals 两个对象内容是否相等*/
