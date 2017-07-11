package demo5;

/**
 * Created by huangjiehui
 * on 17/5/17.
 * 作用：三目运算符：ternary operator
 */
public class TernaryOperator {
    public static void main(String[] args) {
        boolean b = true?false:true==true?false:true;
        System.out.println(b);  //输出结果：false
        //原因："=="优先级高于三目运算符：true?false:true?false:true
        //解释：true?false:true，第一个是 true，选 false:true 中的第一个，所以是 false
        //这题的顺序是从右往左：true?false:(true?false:true)，true?false:false，false
    }
}
