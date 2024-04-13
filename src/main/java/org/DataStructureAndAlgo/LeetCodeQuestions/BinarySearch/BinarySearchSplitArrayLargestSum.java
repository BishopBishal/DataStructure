package org.DataStructureAndAlgo.LeetCodeQuestions.BinarySearch;

public class BinarySearchSplitArrayLargestSum {


/*
* https://leetcode.com/problems/split-array-largest-sum/description/
*
*
* 410. Split Array Largest Sum
Hard
Topics
Companies
Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

Return the minimized largest sum of the split.

A subarray is a contiguous part of the array.



Example 1:

Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
Example 2:

Input: nums = [1,2,3,4,5], k = 2
Output: 9
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.

*
*
* */


    public static void main(String[] args) {
        int k=2;
        int[] nums = new int[]{1,2,3,4,5};
       int sum = findMinInMaximumOfSubArray(k, nums);
        System.out.println("Found the minimum in maximum in the array - "+sum);
    }


    public static int findMinInMaximumOfSubArray(int k, int[] nums)
    {
        int[] range = findRangeInArray(nums);
        int start=range[0];
        int end=range[1];
        while(start<end)
        {
            int mid=(end+start)/2;
            int pieces=findPieceCountInArray(nums,k,mid);
            if(pieces <= k )
            {
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        return start;
    }


    public static int findPieceCountInArray(int[] nums, int k, int mid)
    {
        int piece=1;
        int sum=0;
        for(int i =0;i <= nums.length-1;i++)
        {
            int temp=(sum + nums[i]);
            if(  temp <= mid )
            {
                sum=sum+nums[i];
            }
            else
            {
                piece++;
                sum=nums[i];

            }
        }
        return piece;
    }


    public static int[] findRangeInArray(int[] nums)
    {
        int[]  arr=new int[2];
        int sum=0;
        int max=-1;
        for(int z:nums)
        {
            if(max<z)
                max=z;
            sum=sum+z;
        }
        arr[0]=max;
        arr[1]=sum;
        return arr;
    }



}
