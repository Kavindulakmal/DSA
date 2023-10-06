package com.company.BinarySearch;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int array[] = new int[1000000];
        int target =889;
        for(int i =0; i< array.length;i++){
            array[i]=i;
        }

        //int index = Arrays.binarySearch(array,target);
        int index = binarySearch(array, target);

        if (target==-1){
            System.out.println("value not found");
        }
        else {
            System.out.println("value found from array : " + index);
        }
    }

    private static int binarySearch(int[] array, int target) {
        int min =0;
        int max = array.length-1;

        while (min<=max){
            int middle = min+(max-min)/2;
            int value =array[middle];
            System.out.println("middle value is " +value);

            if(value<target) min= middle+1;
            else if (value>target) max=middle-1;
            else return middle;
        }
        return -1;
    }
}
