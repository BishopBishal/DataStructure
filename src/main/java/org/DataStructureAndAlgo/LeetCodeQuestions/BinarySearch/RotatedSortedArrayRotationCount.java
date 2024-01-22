package org.DataStructureAndAlgo.LeetCodeQuestions.BinarySearch;

public class RotatedSortedArrayRotationCount {

    /*
    *
    * https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
    *
    * Find the Rotation Count in Rotated Sorted array
    *
    * Given an array arr[] of size N having distinct numbers sorted in increasing order
    * and the array has been right rotated (i.e, the last element will be cyclically shifted to
    * the starting position of the array) k number of times, the task is to find the value of k.
    *
    *
    * Input: arr[] = {15, 18, 2, 3, 6, 12}
    * Output: 2
    * Explanation: Initial array must be {2, 3, 6, 12, 15, 18}.
    * We get the given array after rotating the initial array twice.
    *
    * Input: arr[] = {7, 9, 11, 12, 5}
    * Output: 4
    * Input: arr[] = {7, 9, 11, 12, 15};
    * Output: 0
    *
    * */

    public static void main(String[] args) {
        int[] arr ={15, 18, 2, 3, 6, 12};
        int index = findPivotInArray(arr);
        index++;
        System.out.println("Found the starting position - "+index);
    }

    private static int findPivotInArray(int[] arr) {
        int start=0;
        int end= arr.length-1;
        int mid=0;
        while(start<=end)
        {
            mid= start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid+1])
            {
                return mid;
            }
            else if(start < mid && arr[mid] < arr[mid-1])
            {
                return mid-1;
            }
            if(arr[start]<=arr[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }
}
