/**
 * Project name(项目名称)：实例内部类
 * Package(包名): PACKAGE_NAME
 * Class(类名): test4
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/14
 * Time(创建时间)： 19:02
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test4
{
    public int a = 100;
    static int b = 100;
    final int c = 100;
    private int d = 100;

    public String method1()
    {
        return "实例方法1";
    }

    public static String method2()
    {
        return "静态方法2";
    }

    class inner
    {
        int a2 = a + 1; // 访问public的a
        int b2 = b + 1; // 访问static的b
        int c2 = c + 1; // 访问final的c
        int d2 = d + 1; // 访问private的d
        String str1 = method1(); // 访问实例方法method1
        String str2 = method2(); // 访问静态方法method2
    }

    public static void main(String[] args)
    {
        inner i = new test4().new inner(); // 创建内部类实例
        System.out.println(i.a2); // 输出101
        System.out.println(i.b2); // 输出101
        System.out.println(i.c2); // 输出101
        System.out.println(i.d2); // 输出101
        System.out.println(i.str1); // 输出实例方法1
        System.out.println(i.str2); // 输出静态方法2
        System.out.println();

        other.Inner i2 = new other().new Inner();
        System.out.println(i2.b1); // 输出20
        System.out.println(i2.b2); // 输出20
        System.out.println(i2.b3); // 输出10
    }
}
