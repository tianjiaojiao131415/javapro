package com.neuedu.test;

/**
 * Created by admin on 2020/2/7.
 * 二分查找
 */
public class Erfenchazhao {
    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i <array.length-1 ; i++) {
            array[i]=i+1;
        }
        int a=30000;
        int index=find(array,a);
        System.out.println(index);

    }
    //枚举法
    public static int find(int[] array,int value){
        int count=0;
        int index=-1;
        for (int i = 0; i <array.length ; i++) {
           count++;
            if (array[i]==value){
                System.out.println(count);
                return i;
            }
        }
        return -1;
    }
    public static int seacher(int[] array,int value){
        int min=0;
        int max=array.length-1;
        int mid;
        int count=0;
       while (min<=max){
            count++;
           mid=(max+min)/2;
           if (value==array[mid]){
               System.out.println(count);
               return mid;
           }else if (value<array[mid]){
               max=mid+1;
           }else {
               min=mid-1;
           }

       }

        return -1;
    }
}
