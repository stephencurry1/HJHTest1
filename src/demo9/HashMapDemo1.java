package demo9;

import java.util.HashMap;

/**
 * Created by huangjiehui
 * on 2017/6/21.
 * 作用：1、HashMap 的 value 可以是 null； 2、key 值一样，后面的会覆盖前面的。
 */
public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("name",null);
        System.out.println(hashMap.get("name"));
        System.out.println("┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈");
        hashMap.put("name","Curry");
        System.out.println(hashMap.size());
        System.out.println("┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈");
        System.out.println(hashMap.get("name"));
    }
}
