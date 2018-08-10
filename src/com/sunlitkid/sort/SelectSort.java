package com.sunlitkid.sort;

import com.sunlitkid.util.Sorters;

/**
 * 选择排序
 */
public class SelectSort {
    public int[] sort(int[] array) {
        if(array==null){
            return array;
        }
        for(int i = 0 ; i < array.length;i++){
            int minIndex = i;
            for(int j = i ; j < array.length;j++){
                if(array[j]<array[minIndex]){
                    minIndex = j ;
                }
            }
            if(i!=minIndex){
                int tmp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = tmp;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {9,8,5,4,1,4,7,8,4,7,5,8,4};
        SelectSort sorter = new SelectSort();
        int[] sortedArray =sorter.sort(array);
        Sorters.printArray(sortedArray);
    }
}
