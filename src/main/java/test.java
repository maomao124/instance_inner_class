/**
 * Project name(项目名称)：实例内部类
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/14
 * Time(创建时间)： 18:52
 * Version(版本): 1.0
 * Description(描述)： 实例内部类是指没有用 static 修饰的内部类，有的地方也称为非静态内部类。
 * 实例内部类有如下特点
 * 1）在外部类的静态方法和外部类以外的其他类中，必须通过外部类的实例创建内部类的实例。
 * 2）在实例内部类中，可以访问外部类的所有成员。
 * 如果有多层嵌套，则内部类可以访问所有外部类的成员。
 * 3）在外部类中不能直接访问内部类的成员，而必须通过内部类的实例去访问。如果类 A 包含内部类 B，类 B 中包含内部类 C，
 * 则在类 A 中不能直接访问类 C，而应该通过类 B 的实例去访问类 C。
 * 4）外部类实例与内部类实例是一对多的关系，也就是说一个内部类实例只对应一个外部类实例，而一个外部类实例则可以对应多个内部类实例。
 * 如果实例内部类 B 与外部类 A 包含有同名的成员 t，则在类 B 中 t 和 this.t 都表示 B 中的成员 t，而 A.this.t 表示 A 中的成员 t。
 */

public class test
{
    class test1
    {
        test1 i = new test1();

        public void method()
        {
            test1 i1 = new test1();
        }

        public static void method1()
        {
            test1 i2 = new test().new test1();
        }

        class test2
        {
            test2 t3 = new test2();
        }
    }
}

class test3
{
    test.test1 t4 = new test().new test1();
}
