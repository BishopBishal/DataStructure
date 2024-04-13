package org.DataStructureAndAlgo.LeetCodeQuestions.Sorting.CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllTheMissingNumber {


    /*
    *
    * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/S
    *
    *
    * 448. Find All Numbers Disappeared in an Array
Easy
Topics
Companies
Hint
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.



Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]


Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n


Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
*
*
    *
    * */

    public static void main(String[] args) {
        int[] nums=new int[]{1,1};
        List<Integer> disappearedNumbers = findDisappearedNumbers(nums);
        System.out.println("Disappeared Numbers- "+disappearedNumbers.toString());
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int correctIndex=nums[i]-1;
            if(nums[i] == correctIndex  || nums[i] == nums[correctIndex])
                i++;
            else
            {
                int temp=nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
            }
        }
        List missingNumberList=new ArrayList<>();
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
                missingNumberList.add(j+1);
        }
        return missingNumberList;
    }
}
