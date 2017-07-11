package demo2;

/**
 * Created by huangjiehui
 * on 17/5/16.
 * 作用：强制类型转换 byte 测试
 */
public class TypeCast {
    private short a = 10000;
    private byte b = (byte) a;

    public static void main(String[] args) {
        TypeCast typeCast = new TypeCast();
        System.out.println(typeCast.b);         //结果是：-128
    }
}
