package day02;

/**
 * Created by litienan on 2017/11/28.
 */

public class Scale {

    public static void main(String[] args) {
        demo20();
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

    //不同类型的变量
    public static void demo2() {
        //整数类型
        byte b = 12;
        int i = 11;
        short s = 11;
        long l = 33333L;

        //浮点类型
        float f = 22.3F;
        double d = 223.3D;

        //字符类型
        char c = 'a';

        //布尔类型
        boolean b1 = true; //false

    }

    //变量的使用
    public static void demo3() {
        /**
         *  a:同一局域不能使用相同的变量名
         *  b:局部变量必须先赋值再使用
         *  c:一条语句可以定义多个变量
         */
//        int x = 1;
//        int x = 2;

        int y;

        int a, b, c;

    }

    //数据类型之隐士转换
    public static void demo4() {
        byte b = 11;
        int i = 100;

        i = b + i;

    }

    //变量相加和 常量相加的区别
    public static void demo5() {
        byte b1 = 3;
        byte b2 = 4;
//        byte b3 = b1 + b2;

        /**
         * a:byte和byte（short或char）运算会提升为int，两个int相加的结果还是int
         *
         * b:b1和b2是变量，两个变量存储的值是变化的，在编译的时候无法判断里面存储的值，相加会超出byte的取值
         */

        byte b4 = 3 + 4;  //Java编译器有常量优化机制

    }

    //float和long谁的取值范围大
    public static void demo6() {
        //byte,short,char -- int -- long -- float -- double
        //float 占4个字节。 long 占8个字节
        float f = 12.3f;
        long l = 12345L;

        f = l;

    }

    //运算符：算术运算符 赋值运算符 比较运算符 逻辑运算符 位运算符 三目运算符
    public static void demo7() {
        char c = '占';

    }

    //数据类型的概述和分类
    public static void demo10() {
        //1、整数型 byte(-127 - 128占一个字节) short(占两个字节) int(占四个字节) long(占八个字节)
        //2、浮点型 float(占四个字节) double(占八个字节)
        //3、布尔型 boolean
        //4、字符型 char(占两个字节)

        //float的取值范围要比long大
    }

    //++  --
    public static void demo20() {
        //1、单独运算 放在前或后都一样
        int a = 10;
        a++;
//        ++a;
        System.out.println(a);

        //2、参与运算
        int b = 10;
        int c;

//        c = b++;  //先把b的值赋值给c，然后自身+1
        c = ++b;    //b把+1后的值赋值给c。--也是这样

        System.out.println(c + "==" + b);

        //
        byte d = 10;
        d++;          //d = (byte)(d+1);加了强转符
//        d = d+1;    //当byte和int运算时，会提升到int，赋值给byte会损失精度

        System.out.println(d);
    }

    //赋值运算符的基本用法
    public static void demo22() {
        int a = 3;   //把右边的常量赋值给左边的变量

    }

    //关系运算符的基本使用,返回的结果都是boolean类型的
    public static void demo24() {
        //逻辑与 & 并且and  遇到false 则为false  只有都为true， 才为true
        int a = 10;
        int b = 20;
        int c = 30;

        //逻辑或 |    遇到true 则为true
        System.out.println(a < b & b < c);
    }

}
