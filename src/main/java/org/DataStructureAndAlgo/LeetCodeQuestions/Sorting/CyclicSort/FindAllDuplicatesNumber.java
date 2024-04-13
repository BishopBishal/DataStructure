package org.DataStructureAndAlgo.LeetCodeQuestions.Sorting.CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesNumber {

    /*
    *
    *
    * https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
    *
    * 442. Find All Duplicates in an Array
Medium
Topics
Companies
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.



Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:

Input: nums = [1,1,2]
Output: [1]
Example 3:

Input: nums = [1]
Output: []


Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
Each element in nums appears once or twice.
    *
    *
    *
    *
    *
    *
    * */


    public static void main(String[] args) {
        int[] nums =  new int[]{4,3,2,7,8,2,3,1};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println("Duplicates Numbers are - "+duplicates);
    }


    public static List<Integer> findDuplicates(int[] nums) {
        List duplicates = new ArrayList();
        int i=0 ;
        while (i<nums.length)
        {
            int correctIndex=nums[i]-1;
            if(i==correctIndex || nums[i]==nums[correctIndex] )
                i++;
            else
            {
                int temp=nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
            }
        }
        for(int j=0;j< nums.length;j++)
        {
            if(nums[j]!=j+1)
                duplicates.add(nums[j]);
        }
        return duplicates;
    }
}
