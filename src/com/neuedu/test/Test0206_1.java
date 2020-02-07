package com.neuedu.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by admin on 2020/2/6.
 */
public class Test0206_1 {
    public static void main(String[] args) {
        /**
         * 用ArrayList和inkedListL 添加10万个元素
         * 对比性能差异
         * 添加之前，获取当前时间  添加之后获取一个当前时间 添加后-添加之前=用时
         *
         *
         * 结论：
         * 1、ArrayList和LinkedList 在尾部添加的时候 性能差不多
         * 2、ArrayList和LinkedList 在中间插入的时候相比 linkedList性能高于ArrayList很多
         * 3、ArrayList和LinkedList 在读取的时候 arrayList性能要高于LinkedList很多
         * */
        /**
         * ArrayList的源码分析
         *      elementData 为存放数据的数组
         *      size   为实际放入的个数
         *  如果调用有参构造  传一个长度
         *      大于0 elemenData 的长度为传入的长度
         *      等于0 EMPTY_ELEMENTDATA 长度为0的数组
         *      小于0 报错
         *  如果调用无参构造
         *      elementData = DEFAULTCAPACIIY EMPTY  ELEMENTDATA长度为0的数组
         *  add 方法
         *      先扩容（传入size+1 新长度）
         *          先判断elemenData 是否等于 DEFAULTCAPACIIY EMPTY ELEMENTDATA
         *          是否调用的是无参构造创建的对象
         *              如果是  返回size+1 和10 取一个大的值
         *              比如200 数组长度为40
         *              如果 最小长度大于数组的长度 需要扩容
         *              扩容方式：
         *                  数组长度取出作为旧长度
         *                  新长度=旧长度+旧长度右移1
         *                  新长度为60 最小长度为200
         *                  如果扩容之后仍然不够用 新长度=旧长度
         *                  数组的下标为int型 也就是说 最大下标不能超过int的最大值
         *                  然后进行扩容 创建一个更大的数组 把原来的数组里的内容放进新数组中
         *           再添加
         *
         *           new ArrayList（） 和 new ArrayList（0）
         *           无参构造 第一次扩容的时候 最小是10
         *           参数为0 的构造 第一次扩容 最小是1
         *
         *     思考  如果已知有100万个元素  放进ArrayList中 怎样做 性能会更好一些
         *           回答：new ArrayList（100万）
         *
         * */
        /**
         * LinkedList的源码分析
         *      LinkedList记录着队首和队尾
         *      每一个元素都是一个node对象
         *      node对象中包含着 存了什么 上一个是哪一个node 下一个是哪一个node
         *  add  添加方法 默认 添加到最后一个
         *          先把原先的最后一个取出
         *          创建一个新的节点node 上一个为原先的最后一个 下一个为null
         *          队尾变成新节点
         *          判断 队尾是空 说明没有添加过 那么新添加的节点 既是队首也是队尾
         *  get 取值
         *          先比较 要取出的索引 和 长度的一半
         *          如果小于长度的一半 那么从队首向后找性能更好
         *          如果大于长度的一半 那么从队尾向前找想能更好
         *
         * */
        List arraylist=new ArrayList();
        List arrayLink= new LinkedList();
        //记录arraylist添加时的开始时间
        Date startArray = new Date();
        for (int i = 0; i <100000 ; i++) {
           arraylist.add(0,i);
        }
        //记录arraylist添加后的开始时间
        Date endArray= new Date();
        System.out.println("ArrayList添加用时="+(endArray.getTime()-startArray.getTime()));

        //记录arrayLinked加前的开始时间
        Date startLinked =new Date();
        for (int i = 0; i <100000 ; i++) {
            arrayLink.add(0,i);
        }
        //记录arrayLinked加后的开始时间
        Date endLinked =new Date();
        System.out.println("ArrayLinked添加用时="+(endLinked.getTime()-startLinked.getTime()));

        //读取数据时的比较
        //读数据前的时间
        Date startArrayRead = new Date();
        for (int i = 0; i <arraylist.size(); i++) {
            Object object = arraylist.get(i);
        }
        //读完数据之后的时间
        Date endArrayRead = new Date();
        System.out.println("ArrayList添加用时="+(endArrayRead.getTime()-startArrayRead.getTime()));

        Date startLinkedRead = new Date();
        for (int i = 0; i <arraylist.size(); i++) {
            Object object = arrayLink.get(i);
        }
        //读完数据之后的时间
        Date endLinkedRead = new Date();
        System.out.println("ArrayLinked添加用时="+(endLinkedRead.getTime()-startLinkedRead.getTime()));
    }

}
