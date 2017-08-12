package satatic;

/**
 * Created by PH on 2017/8/12.
 */
public abstract class Static1 {
    int i;
    public abstract void eat();
    public static void main(String [] args){
        Static1 s1 = new Static1() {
            @Override
            public void eat() {
                System.out.println("匿名内部类");
            }
        };
        s1.eat();
    }
}
