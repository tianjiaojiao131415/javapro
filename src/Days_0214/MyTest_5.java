package Days_0214;import javax.sound.midi.Soundbank;import java.util.Objects;import java.util.Random;/** * Created by admin on 2020/2/15. * Person类默认继承Object 类 所以可以使用Object类中的equals方法 * Boolean equals （Object obj）指示其他的对象是否与此对象相等 *在Object类中，equals默认比较的是两个对象的地址值，没有意义 * 需要重写equals方法 * 多态的弊端：无法使用子类特有的属性和方法 * 解决方法：向下转型（强转），把Object类型转换为子类的类型 *哪一个对象调用了方法，谁就是this */public class MyTest_5 {    public static void main(String[] args) {        /*Person p1 = new Person(21,"阿哥");        Person p2 = new Person(21,"阿哥");        //p1=p2;        System.out.println("p1:"+p1);        System.out.println("p2:"+p2);        Random r = new Random();        boolean a=p1.equals(r);        System.out.println(a);//false/true*/        String a =null;        String b ="234";       /* boolean b1 = a.equals(b);//NullPointerException  抛出空指针异常，null是不能调用方法        System.out.println(b1);*/       /*       *  Objects类的equals方法，对两个对象进行比较，可以防止空指针异常       *  public static boolean equals(Object a, Object b) {                  return (a == b) || (a != null && a.equals(b));                  }       * */        boolean b1 = Objects.equals(a, b);        System.out.println(b1);    }}