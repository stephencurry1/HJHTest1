package demo7;

/**
 * Created by huangjiehui
 * on 17/5/17.
 * 作用：静态块和构造块
 */
public class StaticAndConstructor {
    public static StaticAndConstructor s1 = new StaticAndConstructor();
    public static StaticAndConstructor s2 = new StaticAndConstructor();
    public static StaticAndConstructor s3 = new StaticAndConstructor();
    //构造块
    {
        System.out.println("构造块");
    }
    //静态代码块
    static {
        System.out.println("静态块");
    }

    public static void main(String[] args) {
        StaticAndConstructor s = new StaticAndConstructor();
    }
}
