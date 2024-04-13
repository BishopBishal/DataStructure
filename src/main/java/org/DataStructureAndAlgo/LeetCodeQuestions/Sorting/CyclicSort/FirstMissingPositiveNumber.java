package org.DataStructureAndAlgo.LeetCodeQuestions.Sorting.CyclicSort;

import java.util.Arrays;

public class FirstMissingPositiveNumber {

    /*
    *
    *
    * https://leetcode.com/problems/first-missing-positive/description/
    *
    *
    * 41. First Missing Positive
Hard
Topics
Companies
Hint
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.



Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.


Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
    *
    * */

    public static void main(String[] args) {
      int[] nums =new int[]{7,8,9,11,12};
        int firstMissingPositive = firstMissingPositive(nums);
        System.out.println("First Missing Positive Number - "+firstMissingPositive);
    }

    public static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int correctIndex=0;
            if(nums[i]>0)
                correctIndex=nums[i]-1;
            else
            {
                i++;
                continue;
            }
            if(nums[i] == correctIndex || nums[i] > nums.length || nums[i]<0 || nums[i] == nums[correctIndex])
                i++;
            else
            {
                int temp = nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
            }
        }

        System.out.println("Sorted Array - "+ Arrays.toString(nums));
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]!=j+1)
                     return j+1;
            }
        return nums.length+1;
    }
}
