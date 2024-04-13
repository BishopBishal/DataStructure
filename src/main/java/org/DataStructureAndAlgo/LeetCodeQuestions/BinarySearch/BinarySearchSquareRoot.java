package org.DataStructureAndAlgo.LeetCodeQuestions.BinarySearch;

import java.math.BigInteger;

public class BinarySearchSquareRoot {

    /*
    *https://leetcode.com/problems/sqrtx/description/
    *
    * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.


Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.


Constraints:
    * 0 <= x <= 231 - 1
    *
    *
    *
    *
    *
    *
    * */


    public static void main(String[] args) {

        int squareNum=2147395599;

        int squareRoot=findSquareRootlong(squareNum);
        System.out.println(" Neareast Square Root Found - "+squareRoot);
    }

    public static BigInteger findSquareRoot(BigInteger squareNum)
    {
        BigInteger start=new BigInteger("1");
        BigInteger end=squareNum;
        while(start.compareTo(end)<=0)
        {
            BigInteger mid =start.add((end.subtract(start)).divide(new BigInteger("2")));
            BigInteger square=mid.multiply(mid);
            if(square.compareTo(squareNum)<0)
            {
                start=mid.add(new BigInteger("1"));
            }
            else if (square.compareTo(squareNum)>0)
            {
                end=mid.subtract(new BigInteger("1"));
            }
            else {
                return mid;
            }
        }
            return end;
    }

    public static int findSquareRootlong(int squareNum)
    {
        long start=1;
        long end=squareNum;
        while(start<=end)
        {
            long mid =start+(end-start)/2;
            long square=mid*mid;
            if(square<squareNum)
            {
                start=mid+1;
            }
            else if (square>squareNum)
            {
                end=mid-1;
            }
            else {
                return (int)mid;
            }
        }
        return (int)end;
    }
}
