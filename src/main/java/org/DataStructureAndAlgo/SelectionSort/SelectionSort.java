package org.DataStructureAndAlgo.SelectionSort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr=new int[]{-123,-123,-1,12,2,54,12,3,1,5,-5,2,1,1,-1,2,4,4};
        int[] selectionSort = selectionSort(arr);
        System.out.println("Sorted Array= "+ Arrays.toString(selectionSort));
    }

    public static int[] selectionSort(int[] arr)
    {
        for(int i =0;i<arr.length;i++)
        {
            int last=arr.length-i-1;
            int maxIndex=findMaxIndex(arr,0,last);
            arr=swapIntegerArray(arr,maxIndex,last);
        }
        return arr;
    }

    private static int[] swapIntegerArray(int[] arr, int maxIndex, int last) {
        int temp=arr[last];
        arr[last]=arr[maxIndex];
        arr[maxIndex]=temp;
        return arr;
    }

    public static int findMaxIndex(int[] arr,int start,int end)
    {
        int max=0;
        for(int i=0;i<=end;i++)
        {
            if(arr[max]<arr[i])
                max=i;
        }
        return max;
    }
}
