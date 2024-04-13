package org.DataStructureAndAlgo.LeetCodeQuestions.Sorting.CyclicSort;

import java.util.Arrays;

public class MissingNumber {

/*
*
*https://leetcode.com/problems/missing-number/description/
*
*
* 268. Missing Number
Solved
Easy
Topics
Companies
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.



Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.


Constraints:

n == nums.length
1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique.


Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
*
* */
    public static void main(String[] args) {

        int[] arr= new int[] {3,1,2};
        int i = missingNumber(arr);
        System.out.println("Missing Number - "+i);
    }

    public static int missingNumber(int[] nums)
    {
        int i=0;
        while(i<nums.length) {

            int correctIndex=i;
            if(nums[i]==correctIndex || nums[i] >= nums.length)
                i++;
            else
            {
                int temp=nums[i];
                nums[i]=nums[nums[i]];
                nums[temp]=temp;
            }
        }
        System.out.println(Arrays.toString(nums));
        for( i =0;i<nums.length;i++)
        {
            if(i!=nums[i])
                return i;
        }
        return nums.length;
    }
}
