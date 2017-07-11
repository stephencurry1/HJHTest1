package demo8;

/**
 * Created by huangjiehui
 * on 17/5/19.
 * 作用：懒汉单例测试类
 */
public class TestSingleton {

    String name = null;

    private TestSingleton(){}

    private static volatile TestSingleton instance = null;

    //双重检查锁定
    public static TestSingleton getInstance(){
        if (instance == null){
            synchronized (TestSingleton.class){
                if (instance == null){
                    instance = new TestSingleton();
                }
            }
        }
        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printInfo(){
        System.out.println("the name is " + name);
    }
}
