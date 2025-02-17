package org.DataStructureAndAlgo.LeetCodeQuestions.BinarySearch;

public class BinarySearchFirstBadVersion {

    /*
    *https://leetcode.com/problems/first-bad-version/description/
    *
    * 278. First Bad Version
Easy
Topics
Companies
You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.



Example 1:

Input: n = 5, bad = 4
Output: 4
Explanation:
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.
Example 2:

Input: n = 1, bad = 1
Output: 1


Constraints:

1 <= bad <= n <= 231 - 1
    *
    *
    *
    *
    * */

    public static int badVersion=9;
    public static int n=10;

    public static void main(String[] args) {
        int firstBadVersion = firstBadVersion(n);
        System.out.println("First Bad Version - "+firstBadVersion);
    }

    public static int firstBadVersion(int n) {
        int start=1;
        int end=n;
        while(start<=end)
        {
            int mid = start+(end- start)/2;
            if(isBadVersion(mid))
            {
                end=mid-1;
            }
            else
                start=mid+1;

        }
        return start;
    }

    public static boolean isBadVersion(int start)
    {
        if(badVersion<=start)
            return true;
        return false;
    }
}
