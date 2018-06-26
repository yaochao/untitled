public class Main {

    /**
     * main函数
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        test2();
    }

    /**
     * 基本数据类型
     */
    private static void test1() {
        double[] myArray = new double[100];
        int a = myArray.length;
        myArray[1] = 1.0;
        System.out.println(myArray[1]);
        System.out.println("hello world!");
        System.out.println("hello world!" + Byte.SIZE);
        System.out.println("hello world!" + Short.SIZE);
        System.out.println("hello world!" + Integer.SIZE);
        System.out.println("hello world!" + Long.SIZE);
        System.out.println("hello world!" + Character.SIZE);
        System.out.println("hello world!" + Boolean.TRUE);

        Byte b = new Byte("1");
        Short s = new Short("1");
        Integer i = new Integer("1");
        Long l = new Long("1");
        byte b1 = 1;
        short s1 = 1;
        int i1 = 1;
        long l1 = 1;
        char c = '姚';
        System.out.println((int) '姚');
        System.out.println((char) Integer.parseInt("8d85", 16));
        System.out.println(s);

        final double PI = 3.1415926;
        System.out.println(PI);

        boolean aa = true;
        boolean cc = Boolean.TRUE;
        System.out.println(aa);
        System.out.println(cc);

        Object o = new Object();
        Integer o1;
        o1 = (int) 'c';
        String s2 = o1.toString();
        System.out.println(s2);


        int hexa = Integer.parseInt("FFFF", 16);
        System.out.println(hexa);

        char c2 = '\u5678';
        String s4 = "\u5678";
        System.out.println(c2);
        System.out.println(s4);

        byte b3 = -128;
        char c3 = (char) b3;
        System.out.println(c3);

        // 丢失精度，byte的范围是-128到127。
        int i2 = 200;
        byte b4 = (byte) i2;
        System.out.println(b4);

        // 标识符
        int $a = 123;
        System.out.println($a);

        // 枚举
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.LARGE;
        System.out.println(juice.size);

        //
    }

    /**
     * hello
     */
    private static void test2() {

        Integer i = 0;
        System.out.println(i);


    }

}

// 枚举类型
class FreshJuice {
    enum FreshJuiceSize {
        SMALL,
        MEDIUM,
        LARGE
    }

    FreshJuiceSize size;
}

