package day02;

/**
 * Created by litienan on 2017/11/28.
 */

public class Scale {

    public static void main(String[] args) {
        demo();
    }

    public static void demo() {
        //不同进制的表现形式
        System.out.println(0b100); //二进制 0b
        System.out.println(0100);  //八进制 0
        System.out.println(100);   //
        System.out.println(0x100); //十六进制 0x
    }

    public static void demo1() {
        //任意进制转十进制
        //基数：X进制，基数就是X
        //系数：每一位上的数字
        //权：从右面0编号开始
        //结果：系数*基数的权次幂相加即可


        //十进制转任意进制：除 基（X）倒取余

    }
    
}
