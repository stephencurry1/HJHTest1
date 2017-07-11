package demo4;

/**
 * Created by huangjiehui
 * on 17/5/17.
 * 作用：测试 StringBuffer 的 length()和 capacity()方法的区别
 */
public class StringBufferCapacity {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer(10);
        s1.append("1234");
        int length = s1.length();
        int capacity = s1.capacity();
        System.out.println("length：" + length);     //length=4
        System.out.println("┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈");
        System.out.println("capacity：" + capacity);     //capacity=10
    }
}
