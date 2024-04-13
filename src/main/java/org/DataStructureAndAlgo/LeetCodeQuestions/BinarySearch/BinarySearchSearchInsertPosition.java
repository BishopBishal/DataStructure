package org.DataStructureAndAlgo.LeetCodeQuestions.BinarySearch;

public class BinarySearchSearchInsertPosition {

/*
*
* https://leetcode.com/problems/search-insert-position/description/
*
*
Code
Testcase
Test Result
Test Result
35. Search Insert Position
Easy
Topics
Companies
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
*
*
* */

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,6};
        int target=5;

        int index= findTargetLocation(target,arr);
        System.out.println("Index Found at = "+index);
        }

        public static int findTargetLocation(int target,int[] arr)
        {
            int start=0;
            int end=arr.length-1;
            while(start < end)
            {
                int mid= (start+end)/2;
                if(arr[mid] < target)
                {
                    start=mid+1;
                } else if (arr[mid] > target) {
                    end=mid;
                }
                else {
                    return mid;
                }
            }
            if(arr[arr.length-1] < target)
                return start+1;
            return start;
        }
}
