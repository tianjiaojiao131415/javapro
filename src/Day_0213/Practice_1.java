package Day_0213;import java.util.ArrayList;import java.util.List;/** * Created by admin on 2020/2/13. */public class Practice_1 {    public static void main(String[] args) {      //  System.out.println(method(7));     //   System.out.println(method(1000));        //  System.out.println(gaodu(100));        shu();    }    //输出斐波那契数列  以 1 1 开头 后面每一位都是前两位之和    // 1 2 3 5 8 13   /* public static int method(int n){        if (n==1||n==2){            return 1;        }else {            int f1=1;            int f2=1;            int sum;            for (int i = 3; i <=n ; i++) {                sum=f1+f2;                f1=f2;                f2=sum;            }            return f2;        }}*/   //n个人围成一圈，数到3的人被remove掉   /*public static int method(int n) {       List<Integer> list = new ArrayList<>();       for (int i = 0; i < n; i++) {           list.add(i);       }       int m = 1;       while (list.size() > 1) {           if (m != 3) {               int first = list.remove(0);               list.add(first);               m++;           } else {               list.remove(0);               m = 1;           }       }       return list.get(0);   }*/   //一个球从100米高度落下，每次落地后反弹到原高度的一半，求第10次落地后 反弹多高    /*public static double gaodu(double n){       for (int i = 0; i <=10 ; i++) {           n=n/2;       }       return n;   }*/    //一个整数 加100后是一个完全平方数 再加168也是一个完全平方数 该数是多少    public static void shu(){        for (int i = 0; i <1000 ; i++) {            if ((Math.sqrt(i+100)-(int)Math.sqrt(i+100)==0)&&(Math.sqrt(i+168)-(int)Math.sqrt(i+168)==0)){                System.out.println(i);            }        }    }}