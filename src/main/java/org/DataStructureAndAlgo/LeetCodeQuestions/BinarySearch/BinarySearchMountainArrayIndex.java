package org.DataStructureAndAlgo.LeetCodeQuestions.BinarySearch;


public class BinarySearchMountainArrayIndex {
/*
*
* BITONIC ARRAY
* 
* https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
*
* 852. Peak Index in a Mountain Array
*
* 
*An array arr is a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

You must solve it in O(log(arr.length)) time complexity.



Example 1:

Input: arr = [0,1,0]
Output: 1
Example 2:

Input: arr = [0,2,1,0]
Output: 1
Example 3:

Input: arr = [0,10,5,2]
Output: 1

**/
    public static void main(String[] args)
{
    int[]  arr = new int[]{1,2,3,5,7,6,3,2}; //BITONIC ARRAY    

    int index = findTheMountainPeek(arr);
    System.out.println(index);
    
}
    
    public static int findTheMountainPeek(int[] arr) {
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<end)
        {
            mid=start + ((end-start)/2);


            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
              else 
              {
                 start=mid+1;
              }

        }
        return start;
    }

}