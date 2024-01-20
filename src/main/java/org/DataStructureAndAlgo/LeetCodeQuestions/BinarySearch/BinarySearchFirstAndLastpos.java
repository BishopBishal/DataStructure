package org.DataStructureAndAlgo.LeetCodeQuestions.BinarySearch;

import java.util.Arrays;

public class BinarySearchFirstAndLastpos {

    /* 
     * 34. Find First and Last Position of Element in Sorted Array
     * 
     * Given an array of integers nums sorted in non-decreasing order, find the starting and ending
     * position of a given target value.If target is not found in the array, return [-1, -1].
     *You must write an algorithm with O(log n) runtime complexity.
     * 
     * 
     * 
     *
     * Example 1:Input: nums = [5,7,7,8,8,10], target = 8 
     * Output: [3,4] 
     * Example 2:
     * 
     * Input: nums = [5,7,7,8,8,10], target = 6
     * Output: [-1,-1]
     * Example 3:
     * 
     * 
     * Input: nums = [], target = 0
     * Output: [-1,-1]
     */

    public static void main(String[] args) {

        int[] nums={5,7,8,8,8,10};
        int target=8;
        int[] answer =searchRange(nums,target);
        System.out.println(Arrays.toString(answer));
        
    }
    public static int[] searchRange(int[] nums, int target) {
        
        int[] ans=new int[]{-1,-1};

        ans[0]=search(nums,target,true);
        if(ans[0]!=-1)
        {
            ans[1]=search(nums,target,false);
        }
        return ans;
    }
    private static int search(int[] nums, int target, boolean findInitialIndex) {

        int start=0;
        int end=nums.length-1;
        int mid;
        int ans=-1;
        while(start <= end)
        {
            
            mid=start + ((end-start)/2);
            if(nums[mid] < target)
            {
                start=mid+1;
            }
            else if (nums[mid] > target) {
                end =end-1;
            }
            else{
                ans=mid;
                if(findInitialIndex)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
                 
            }
        }
        return ans;
     }
    
}
