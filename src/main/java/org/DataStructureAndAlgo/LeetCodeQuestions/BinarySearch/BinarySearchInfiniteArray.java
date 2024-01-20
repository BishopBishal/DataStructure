package org.DataStructureAndAlgo.LeetCodeQuestions.BinarySearch;


public class BinarySearchInfiniteArray {
    
    /*
    *
    * https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
    *
    *
    *  Suppose you have a sorted array of infinite numbers, how would you search an element in the array?
    *
    *  Source: Amazon Interview Experience. 
    *
    *
    *
    */
    
    public static void main(String[] args){
        int[] array=new int[]{3,5,6,7,10,15,27};
        
        int target = 10; // element to be searched
        int start = 0;
        int end = 1;
        try {
            while(target > array[end])
            {
                int newStart=end+1;
                end=end+(end-start+1)*2;
                start=newStart;
            }

            int index=BinarySearch(array,start,end,target);
          System.out.printf("Element Found at "+index);
           
        }catch (IndexOutOfBoundsException e)
        {
            System.out.print("Element not Found !!");
        }
    }

    private static int BinarySearch(int[] arr, int start, int end,int target) {
        int mid;
     while(start<=end)
         {
             mid=start+((end-start)/2);
             
             if(arr[mid]<target)
                 {
                     start=mid+1;
                 }
             else if(arr[mid]> target){
                 end=mid-1;
             }
             else {
                 return arr[mid];
             }
         }
        return -1;
    }
}

