package org.DataStructureAndAlgo.LeetCodeQuestions.BinarySearch;

public class BinarySearchMinimumSortedArray {

    /*
    *
    * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
    *
    *   153. Find Minimum in Rotated Sorted Array
Medium
Topics
Companies
Hint
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.



Example 1:

Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
    *
    * */

    public static void main(String[] args) {
        int[] arr = new int[]{2,1};
        int startIndex = findStartIndex(arr);
        System.out.println(" Minimum index is "+ arr[startIndex+1]);
    }

    public static  int findStartIndex ( int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while (start <= end)
        {
            int mid=end - (end-start)/2;
            if( end > mid && arr[mid] > arr[mid+1])
                return mid;
            else if (start < mid && arr[mid-1] > arr[mid]) {
                return mid-1;
            }
            else if(arr[start]  >= arr[mid])
            {
                end=mid-1;
            }
            else  {
                start=mid+1;
            }
        }
        return -1;
    }
}
