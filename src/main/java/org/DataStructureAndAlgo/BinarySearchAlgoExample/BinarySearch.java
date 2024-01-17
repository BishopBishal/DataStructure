package org.DataStructureAndAlgo.BinarySearchAlgoExample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinarySearch {
      public static enum Order{
        EQUAL,
        ASECENDING,
        DESCENDING
    };

    
    /* 
     * 
     * Binary Search Algorithm is the algorithm which assumes the array is sorted first and then it points two pointers first which is pointing the initial element and last which points to the last element.Then we find the middle element in the array and checks if the middle element is the searching element or not .If not then checks if the middle element is greater than or less than to the middle element if the middle element is greater than searching element than search left or else search right.Assumming array is sorted in ascending order if descending order then the pattern to go for searching the element after the middle element is found gets reversed and this process goes on until we found the element i.e middle element becomes the searching elememt or the start pointer pointing to the index becomes greater than the end pointer index.
     * 
     * Best Case Senario in Binary Search Algorithm is O(1)
     * Worst Case Senario in Binary Search Algorithm  
     */
    public static void main(String[] args) throws Exception{

        

        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {14,6,3,5,7,9};
        arr=Arrays.stream(arr).sorted().toArray();
         int[] arr1 = {114,61,42,34,17,3};
         int[]  arr2= {3,3,3,3,3,3};
        System.out.println("Enter the targer number to find ?");
        int target =Integer.valueOf(in.readLine());
        System.out.println("Going to find the "+target + " in array --> "+Arrays.toString(arr));
        System.out.println("Going to find the "+target + " in array1 --> "+Arrays.toString(arr1));
        System.out.println("Going to find the "+target + " in array2 --> "+Arrays.toString(arr2));
        /* int index = findNumberUsingtheBinaryAlgoInAscending(arr,target);
        if(index!=-1)
            System.out.println("Found the "+arr[index]+" at the index "+index);
        else
            System.out.println("Number not Found !!!"); */
        
        int index = findNumberUsingTheOrderAgnosticBinaryAlgo(arr,target);
        if(index!=-1)
            System.out.println("Found the "+arr[index]+" at the index "+index);
        else
            System.out.println("Number not Found !!!");
         index = findNumberUsingTheOrderAgnosticBinaryAlgo(arr1,target);
        if(index!=-1)
            System.out.println("Found the "+arr1[index]+" at the index "+index);
        else
            System.out.println("Number not Found !!!");
          index = findNumberUsingTheOrderAgnosticBinaryAlgo(arr2,target);
        if(index!=-1)
            System.out.println("Found the "+arr2[index]+" at the index "+index);
        else
            System.out.println("Number not Found !!!");
    
    }


    private static int findNumberUsingTheOrderAgnosticBinaryAlgo(int[] arr, int target) {
      int start =0;
      int end = arr.length-1;
      Order flag=Order.EQUAL;
      if(arr[start] < arr[end])
      {
       
        flag =Order.ASECENDING;
      }
      else if (arr[start] > arr[end]) {
        flag = Order.DESCENDING;
      }
    

      
        if(flag.equals(Order.ASECENDING))
        {
             int index= findNumberUsingtheBinaryAlgoInAscending(arr, target);
             return index;
        }
        else if(flag.equals(Order.DESCENDING))
        {
           int index2 = findNumberUsingtheBinaryAlgoInDescending(arr, target);
           return index2;
        }
        else{
           if (arr[start]==target) {
            return start;
           }
           else{
            return -1;
           }
           
        }
      
    }


    private static int findNumberUsingtheBinaryAlgoInAscending(int[] arr,int target) {
        int start=0;
        int end=arr.length-1;
        int mid = -1;
        while(start<=end)
        {
            mid=start + ((end-start)/2);
            if(arr[mid]<target)
            {
                start=mid+1;
            }
            else if (arr[mid]>target) {
                end =mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    } 


    private static int findNumberUsingtheBinaryAlgoInDescending(int[] arr,int target) {
        int start=0;
        int end=arr.length-1;
        int mid = -1;
        while(start<=end)
        {
            mid=start + ((end-start)/2);
            if(arr[mid]>target)
            {
                start=mid+1;
            }
            else if (arr[mid]<target) {
                end =mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    } 
}
