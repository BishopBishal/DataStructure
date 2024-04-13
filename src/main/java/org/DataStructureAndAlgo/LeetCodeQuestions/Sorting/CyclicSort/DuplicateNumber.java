package org.DataStructureAndAlgo.LeetCodeQuestions.Sorting.CyclicSort;

import java.util.Arrays;

public class DuplicateNumber {

    public static void main(String[] args) {
        int[] nums=new int[]{1,3,4,2,2};
        int ans = duplicateNumber(nums);
        System.out.println("Duplicate number- "+ans);
    }

    public static int duplicateNumber(int[] nums)
    {
        int i=0 ;
        while (i<nums.length)
        {
            int correctIndex=nums[i]-1;
            if(i==correctIndex )
                i++;
            else if (nums[i]==nums[correctIndex]) {
            return nums[i];
            }
            else
            {
                int temp=nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
            }
        }
        return -1;
    }
}
