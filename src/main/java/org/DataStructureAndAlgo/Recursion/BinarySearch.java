package org.DataStructureAndAlgo.Recursion;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr=new int[]{2,5,7,8,10,12};
        int target=12;
        int result = binarySearchRecurssive(0, arr.length - 1, arr,target);
        System.out.println("Target found - "+result);
    }

    public static int binarySearchRecurssive(int start,int end, int[] arr,int target)
    {
        int mid=start+(end-start)/2;
        if(arr[mid]<target)
        {
            start=mid+1;
           return binarySearchRecurssive(start,end,arr,target);
        } else if (arr[mid]>target) {
            end=mid-1;
            return binarySearchRecurssive(start,end,arr,target);
        }
       else
        {
            return arr[mid];
        }
    }
}
