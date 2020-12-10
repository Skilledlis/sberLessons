package org.sber;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,1,66,12,86,3,7,23,5};

        bubbleSort(arr);
        for (int num : arr) {
            System.out.print(num+" ");
        }

        System.out.println();

        System.out.println(binarySearch(arr,12));

    }

    public static int[] bubbleSort(int[] arr){
        boolean sorted = false;
        int buffer;
        while (!sorted){
            sorted=true;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i]>arr[i+1]){
                    buffer = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buffer;
                    sorted=false;
                }
            }
        }
        return arr;
    }

    public static int binarySearch(int[] arr, int key){
        int firstIndex = 0;
        int lastIndex = arr.length-1;

        while (firstIndex <= lastIndex){
            int middle = (lastIndex + firstIndex) /2;

            if (key == arr[middle]){
                return middle;
            } else if (key < arr[middle]){
                 lastIndex = middle -1;
            } else if (key > arr[middle]){
                firstIndex = middle+1;
            }
        }
        return -1;
    }
}
