package org.sber;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

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
