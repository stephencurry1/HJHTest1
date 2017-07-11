package demo8;

/**
 * Created by huangjiehui
 * on 17/5/19.
 * 作用：饿汉单例模式：在类创建的同时就已经创建好了一个静态的对象供系统使用，所以天生就是线程安全的
 */
public class EagerSingleton {
    private EagerSingleton(){}
    //初始化类的时候就创建实例
    private static final EagerSingleton singleton = new EagerSingleton();
    //静态工厂方法
    public static EagerSingleton getInstance(){
        return singleton;
    }
}
