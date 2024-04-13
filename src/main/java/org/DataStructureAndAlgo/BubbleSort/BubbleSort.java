package org.DataStructureAndAlgo.BubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
//        int[] arr=new int[]{5,4,3,2,1};
        int[] arr=new int[]{-1,-7,-32,32,0,89};
        arr=bubleSorting(arr);
        System.out.println("Sorted Array = "+ Arrays.toString(arr));
    }

    public static int[] bubleSorting(int[] arr)
    {
        boolean isAlreadySorted=false;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=1;j<=arr.length-i-1;j++)
            {
                if(arr[j] < arr[j-1])
                {
                    isAlreadySorted=true;
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
            if(!isAlreadySorted)
                break;
        }
        return arr;
    }
}
