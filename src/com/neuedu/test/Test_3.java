package com.neuedu.test;import java.util.ArrayList;import java.util.Date;import java.util.List;/** * Created by admin on 2020/2/6. */public class Test_3 {    public static void main(String[] args) {        List arraylist=new ArrayList();        //记录添加时的开始时间        for (int i = 0; i <1000000 ; i++) {            System.out.println(arraylist.get(i));        }    }}