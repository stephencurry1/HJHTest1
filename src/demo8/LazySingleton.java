package demo8;

/**
 * Created by huangjiehui
 * on 17/5/19.
 * 作用：懒汉单例：在第一次调用的时候实例化自己
 */
public class LazySingleton {
    //静态内部类
    private static class LazyHolder {
        private static final LazySingleton INSTANCE = new LazySingleton();
    }
    private LazySingleton (){}
    public static final LazySingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
