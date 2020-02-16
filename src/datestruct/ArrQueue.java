package datestruct;import java.util.Scanner;/** * Created by admin on 2020/2/16. * * 用数组来模拟队列 * 问题：用数组的方法模拟队列， * 使用这样的方法，该队列只能用一次，把数据满后，全部取出后，就不能再存入数据了 */public class ArrQueue {    public static void main(String[] args) {        ArrMethod arrMethod = new ArrMethod(4);        int key;        while (true){            Scanner sc = new Scanner(System.in);            System.out.println("请输入数字，选择你的操作");            System.out.println("1、添加数据");            System.out.println("2、获取数据");            System.out.println("3、显示所有的数据");            System.out.println("4、显示队首数据");            System.out.println("5、退出");            int a=sc.nextInt();            switch (a){                case 1:                    System.out.println("请输入一个数字");                    int s = sc.nextInt();                    arrMethod.add(s);                    break;                case 2:                    try {                        int g = arrMethod.get();                        System.out.println("取出的数据时："+g);                    }catch (Exception ex){                        System.out.println(ex.getMessage());//出现错误时输出                    }                    break;                case 3:                    arrMethod.show();                    break;                case 4:                    try {                        int head = arrMethod.head();                        System.out.println("取出的头数据是"+head);                    }catch (Exception ex){                        System.out.println(ex.getMessage());                    }                    break;                case 5:                    System.exit(1);                    break;                default:                    System.out.println("输入错误");                    break;            }        }    }    public static class ArrMethod{        private int maxSize;//用来定义数组的数组的最大长度        private int rear;//数组尾        private int front;//数组头        private int[] arr;//这个数组        //创建队列的构造器        public ArrMethod(int aarMaxSize) {            maxSize=aarMaxSize;            arr=new int[aarMaxSize];//创建模拟数组            front=-1;//数组头部的起始值            rear =-1;//数组尾部的起始值        }        //向数组中输入数据时，要判断数组是否已经满了，没有满，可以加入，满了不能加入        public boolean isFull(){            return rear==maxSize-1;//队列满的时候，队尾的下标等于队列的最大长度-1        }        //如果要输出数据时，要先判断数组是否为空，数组为空时不能输出        public boolean isEmpty(){            return front==rear;//队列为空时，队首等于队尾        }        //输入数据        public void add(int n){            if (isFull()){                System.out.println("数组满了，不能输入");                return;            }            rear++;//否则就向队尾加入数据            arr[rear]=n;        }        //获取数据，输出，出队列        public  int  get(){            if (isEmpty()){                throw new RuntimeException("数组为空，没有数据");            }            front++;//队首++            return arr[front];        }        //显示队列的所有数据        public void show(){            if (isEmpty()){                System.out.println("数组为空,没有数据");                return;            }            for (int i = 0; i <arr.length ; i++) {                System.out.println(arr[i]);            }        }        //显示队列的头部        public int head(){            if (isEmpty()){                throw new RuntimeException("数组为空,没有数据");            }            System.out.println(arr[front+1]);            return arr[front+1];        }    }}