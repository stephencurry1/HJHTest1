package demo6;

/**
 * Created by huangjiehui
 * on 17/5/17.
 * 作用：
 */
public class StaticDemo1 {
    private int a;
    static int i;

    public static void main(String[] args) {
        System.out.println(i);      //结果：0；
        //main 方法是 static，调用对象的时候，必须先 new 一个对象
        StaticDemo1 staticDemo1 = new StaticDemo1();
        System.out.println(staticDemo1.a);  //结果：全局变量默认值为0
    }
}

