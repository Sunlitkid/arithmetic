package com.sunlitkid.util;

/**
 * Created by sunke on 2018/8/10.
 */
/*
     排序器
 */
public class Sorters {
    public static  void printArray(int[] array){
        if(array==null){
            return ;
        }
        int length  = array.length;
        for(int i = 0 ; i < length;i++){
            System.out.print(array[i]);
            if(i<length-1){
                System.out.print(",");
            }
        }
    }
}
