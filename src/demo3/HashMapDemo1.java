package demo3;

import java.util.HashMap;

/**
 * Created by huangjiehui
 * on 17/5/17.
 * 作用：①：hashMap 的 value 可以是 null
 *      ②：key 值一样，后面的会覆盖前面的
 */
public class HashMapDemo1 {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("name",null);
        //hashMap.put("name","Curry");
        System.out.println(hashMap.size());
        System.out.println(hashMap.get("name"));
    }

}
