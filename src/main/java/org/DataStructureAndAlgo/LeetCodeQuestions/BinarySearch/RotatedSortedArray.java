package org.DataStructureAndAlgo.LeetCodeQuestions.BinarySearch;

public class RotatedSortedArray {

    /*
    *
    * 33. Search in Rotated Sorted Array
Medium
Topics
Companies
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
    *
    * */


    public static void main(String[] args) {
        int[] arr= {6,7,1,2,3,4,5};
        int target=6;
        int index=findPivotOfArray(arr);
        System.out.println("Index found of pivot is - "+index);
        if(index==-1)
        {
            index=binarySearch(arr,target,0,arr.length-1);
            System.out.println("Element Found in normal array - "+ arr[index]);
        }
       if(arr[index]==target)
       {
           System.out.println("Element found at pivot in array - "+arr[index]);
       }
       if(target >= arr[0])
       {
           index=binarySearch(arr,target,0,index-1);
           System.out.println("Element found at left side of the array is - "+index);
       }
       else{
           index=binarySearch(arr,target,index+1,arr.length-1);
           System.out.println("Element found at right side of the array is - "+index);
       }
    }




    private static int findPivotOfArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] arr,int target,int start ,int end) {
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
}
