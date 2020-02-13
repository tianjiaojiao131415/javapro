package Day_0213;import java.util.Vector;/** * Created by admin on 2020/2/13. */public class MyRunnable implements Runnable {    Object obj = new Object();    private int count =80;    //实现Runnable，需要重写run方法    @Override    public void run() {        while (count>0){            //出现问题的原因是，当第一个线程进入while循环后，还没等到count--，第二个进程就进入了while循环            //方法：            /**             * 线程同步：  synchronized (锁旗标（任何一个对象都可以）){             *             * }             * 被synchronized包裹的语句 如果要执行就要拿到锁旗标，如果锁旗标被其他的线程拿到，就要等其他线程执行结束后在拿             * 换句话说，synchronized 包裹的语句，一次只能被一个线程执行             * 加上锁旗标后就不会出现count乱序的情况             * synchronized 可以用来修饰方法，当用来修饰方法时，锁旗标时this             * Vector  \     StringBuffer 是线程安全的，他们的大多数方法都是有 synchronized进行包裹的             * */            synchronized (obj){                System.out.println(Thread.currentThread().getName()+"卖了"+count+"张票");                count--;                try {                    Thread.sleep(500);                } catch (InterruptedException e) {                    e.printStackTrace();                }            }        }    }    //在没加synchronized的情况下，add和del交替进行    //加上synchronized的情况下，会先把add执行完后，才执行del    public synchronized void add(){        //死循环        while (true){            System.out.println("add");            try {                Thread.sleep(500);            } catch (InterruptedException e) {                e.printStackTrace();            }        }    }    public synchronized void del(){        while (true){            System.out.println("del");            try {                Thread.sleep(500);            } catch (InterruptedException e) {                e.printStackTrace();            }        }    }}