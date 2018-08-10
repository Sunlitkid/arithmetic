package com.sunlitkid.sort;

import com.sunlitkid.util.Sorters;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public int[] sort(int[] array) {
        if(array==null){
            return array;
        }
        //如果这一趟过去没有任何元素交换，说明是有序的 直接返回
        boolean flag = true;
        int length = array.length;
        for(int i = 0  ; i < length&&flag ; i ++){
            //默认这一趟过去没有交换元素
            flag = false;
            for(int j = 0 ; j< length-1 - i ; j ++){
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag =true;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {9,8,5,4,1,4,7,8,4,7,5,8,4};
        BubbleSort sorter = new BubbleSort();
        int[] sortedArray =sorter.sort(array);
        Sorters.printArray(sortedArray);
    }
}
