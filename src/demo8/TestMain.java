package demo8;

/**
 * Created by huangjiehui
 * on 17/5/19.
 * 作用：测试调用 TestSingleton
 */
public class TestMain {
    public static void main(String[] args) {
        TestSingleton t1 = TestSingleton.getInstance();
        t1.setName("Curry1");
        TestSingleton t2 = TestSingleton.getInstance();
        t2.setName("Curry2");

        t1.printInfo();
        t2.printInfo();

        if (t1 == t2){
            System.out.println("创建的是同一个实例");
        }else {
            System.out.println("创建的不是同一个实例");
        }
    }
}
