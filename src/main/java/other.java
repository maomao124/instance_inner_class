/**
 * Project name(项目名称)：实例内部类
 * Package(包名): PACKAGE_NAME
 * Class(类名): other
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/14
 * Time(创建时间)： 19:14
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class other
{
    int a = 10;

    class Inner
    {
        int a = 20;
        int b1 = a;
        int b2 = this.a;
        int b3 = other.this.a;
    }

    public static void main(String[] args)
    {
        Inner i = new other().new Inner();
        System.out.println(i.b1); // 输出20
        System.out.println(i.b2); // 输出20
        System.out.println(i.b3); // 输出10
    }
}
