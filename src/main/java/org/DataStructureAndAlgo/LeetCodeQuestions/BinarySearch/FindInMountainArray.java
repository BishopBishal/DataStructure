package org.DataStructureAndAlgo.LeetCodeQuestions.BinarySearch;

public class FindInMountainArray {
/*
* 1095. Find in Mountain Array
* (This problem is an interactive problem.)

You may recall that an array arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.

You cannot access the mountain array directly. You may only access the array using a MountainArray interface:

MountainArray.get(k) returns the element of the array at index k (0-indexed).
MountainArray.length() returns the length of the array.
Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.
*
*
*
* Example 1:

Input: array = [1,2,3,4,5,3,1], target = 3
Output: 2
Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
Example 2:

Input: array = [0,1,2,4,2,1], target = 3
Output: -1
Explanation: 3 does not exist in the array, so we return -1.
* */

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,3,1};
        int target=3;
        int index=findPeekOfMountain(arr);
        System.out.println("Peek Found At Mountian - "+index +" Element - "+arr[index]);
         index=findInAscendingDescdingArray(arr,index,target);
         if(index!=-1)
            System.out.println("Target Found at index - "+index+" Element found at target - "+arr[index]);
         else
             System.out.println("Element Not Found !!!");
    }

    private static int findInAscendingDescdingArray(int[] arr, int index,int target) {
        int ans=-1;
        int start=0;
        int end=index;
        ans=findInBinaryArray(arr,start,end,target,false);
       if(ans==-1)
       {
           start=end+1;
           end=arr.length-1;
           ans=findInBinaryArray(arr,start,end,target,true);
       }
        return ans;
    }

    private static int findInBinaryArray(int[] arr, int start,int end,int target,boolean flag) {
        int ans=-1;
        int mid=0;
        boolean flagForOrder=flag;

        while(start<=end)
        {
            mid=start+((end-start)/2);
            if(target<arr[mid])
            {
                if(!flagForOrder)
                    end=mid-1;
                else
                    start=mid+1;
            } else if (target>arr[mid]) {
                if(!flagForOrder)
                    start=mid+1;
                else
                    end=mid-1;
            }
            else {
                ans = mid;
                break;
            }
        }
        return ans;
    }

    private static int findPeekOfMountain(int[] arr) {
        int start=0;
        int end=arr.length-1;
        int mid=0;

        while(start<end)
        {
            mid=start+((end-start)/2);
            if(arr[mid]<arr[mid+1])
            {
                start=mid+1;
            }
            else {
                end=mid;
            }
        }
        return start;
    }

}