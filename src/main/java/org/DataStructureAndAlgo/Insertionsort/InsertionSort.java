package org.DataStructureAndAlgo.Insertionsort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr=new int[]{-12,-22,123,-311,-643,353};
        System.out.println("Sorted Array - "+ Arrays.toString(insertionSort(arr)));
    }

    public static int[] insertionSort(int[] arr)
    {
        for(int i =0;i<=arr.length-2;i++)
        {
            for (int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                    swap(arr,j,j-1);
                else
                    break;
            }
        }
        return arr;
    }

    public static void swap(int[] arr,int index1,int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
