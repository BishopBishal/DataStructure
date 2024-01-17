package org.DataStructureAndAlgo.BinarySearchAlgoExample;

import java.util.Arrays;

public class FloorNumberBinarySearch {
    
     /* 
     * Find the floor of the number for the given array where target is 15.Array - {2,3,5,9,14,16,18}
     * 
     * where the floor number for the target number is 14 because the floor number is the number which 
     * is greatest element  in the array less than or equal to target
     */

     public static void main(String[] args) {
         int[] arr={2,3,5,9,14,16,18};
      int target=10;
      int floorNumber=findFloorNumber(arr,target);
      System.out.println("Floor number for the array "+Arrays.toString(arr)+" is = "+floorNumber);
     }

    private static int findFloorNumber(int[] arr, int target) {
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
    return arr[end];
    }
}
