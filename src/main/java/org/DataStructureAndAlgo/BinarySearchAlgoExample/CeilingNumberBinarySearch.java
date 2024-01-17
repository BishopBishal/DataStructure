package org.DataStructureAndAlgo.BinarySearchAlgoExample;

import java.util.Arrays;

public class CeilingNumberBinarySearch{

    /* 
     * Find the ceiling of the number for the given array where target is 15.Array - {2,3,5,9,14,16,18}
     * 
     * where the ceiling number for the target number is 16 because the ceiling number is the number which 
     * is smallest element  in the array greater or equal to target
     */

    public static void main(String[] args)
    {
      int[] arr={2,3,5,9,14,16,18};
      int target=15;
      int ceilingNumber=findCeilingNumber(arr,target);
      System.out.println("Ceiling number for the array "+Arrays.toString(arr)+" is = "+ceilingNumber);


     
       
    }

   

    private static int findCeilingNumber(int[] arr,int target) {
        int start=0;
        int end=arr.length-1;
        int mid=0;
       
        while(start<=end)
        {
            mid=start +((end-start)/2);
            if(arr[mid]<target)
            {
              start=mid+1;
            }
            else if (arr[mid] > target) {
                end=mid-1;
                
            }
            else{
                return arr[mid];
            }
        }
    return arr[start];
    }


}