package org.DataStructureAndAlgo.CyclicSort;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {

        //This sort takes only place when you know the range of the array like array started from which number and ends with which number  and should have all the continuos values
        int[] arr=new int[]{3,5,1,4};
        cyclicSort(arr);
        System.out.println("Sorted Array - "+ Arrays.toString(arr));
    }

    public static  int[] cyclicSort(int[] arr )
    {
        int i=0;
        while (i<arr.length)
        {
            //checking if the index i is at the correct index or not
            int correctIndex=arr[i]-1;
            if(i==correctIndex)
                i++;
            else {
                 swap(arr, i, correctIndex);
            }
        }
        return arr;
    }

    public static int[] swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
        return arr;
    }
}
