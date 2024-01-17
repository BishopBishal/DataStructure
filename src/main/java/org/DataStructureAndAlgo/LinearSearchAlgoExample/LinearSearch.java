package org.DataStructureAndAlgo.LinearSearchAlgoExample;

public class LinearSearch {
    /* 
     * LinearSearch is the search of element in a array linearly one by one.
     * Time Complexity
     * Best Case - O(1)
     * Worst Case - O(n) where n is the size of the array
     * 
     * 
     * 
     */

     public static void main(String[] args) {

       // Have given the example with respect to integer array can be implemented same for char array etc 
        int[] array ={1,2,4,5,5,1,12,7,90,234,42,234,8,9,3,2,14,6
            ,7,843,42,2342234,23,24,24,24,275767,58,3,2,424,2,223,4234};

             int[][] array2D={{1,2,4,5,5,1},{12,7,90,234,42,234,8,9,3},{2,14,6
            ,7,843,42,2342234,23,24,24,24,275767,58,3,2,424,2,223,4234}};

        findNumber(array);
        findNumberIn2DArray(array2D);
        int minimum = findMinimum(array);
        System.out.println("Minimum of the number is  "+minimum);
        int maximumIn2DArray = findMaximumIn2DArray(array2D);
        System.out.println("Maximum of number in 2DArray is   "+maximumIn2DArray);


        /* 
         * LeetCode Questions
         * 
         * 1)Given an array nums of integers, return how many of them contain an even number of digits.
         * Input: nums = [12,345,2,6,7896]
            Output: 2
         * 
         * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
         * Input: accounts = [[1,2,3],[3,2,1]]
         *   Output: 6
         * 
         */

         int[] nums = {12,345,2,6,7896};
        int nuumberOfEvenDigit=countEvenNumberOfDigit(nums);
        System.out.println("Number of Even digits are = "+nuumberOfEvenDigit);

        int[][] accounts={{1,2,3},{3,2,1}};
        int[][] accounts1={{1,5},{7,3},{3,5}};
        int[][] accounts2={{2,8,7},{7,1,3},{1,9,5}};

         System.out.println("Maximum Wealth is = "+findWealth(accounts));    
         System.out.println("Maximum Wealth is = "+findWealth(accounts1));    
         System.out.println("Maximum Wealth is = "+findWealth(accounts2));    
         
     }


     

    private static int findWealth(int[][] accounts) {
        int max=0;
      for (int[] is : accounts) {
        int sum=0;
        for (int is2 : is) {
          sum+=is2;
        }
        if(max<sum)
        {
            max=sum;
        }
      }
    return max;
    }




    private static int countEvenNumberOfDigit(int[] nums) {
         int max=0;
        for (int i : nums) {
            int count=0;
            while(i>0)
            {
                i=i/10;
                count++;
            }
            if(count%2==0)
              {
               max++;
              }
        }
        return max;
    }




    private static int findMaximumIn2DArray(int[][] array2d) {
        int max=array2d[0][0];
        for (int[] is : array2d) {
            for (int is2 : is) {
                if(max<is2)
                {
                    max=is2;
                }
            }
        }
        return max;
    }

    private static void findNumberIn2DArray(int[][] array2d) {

        for (int[] is : array2d) {
            for (int is2 : is) {
                if(is2==42)
                {
                    System.out.println("Found !! In 2DArray");
                    return;
                }
            }
        }
        System.out.println("Not Found !! In 2DArray");
    }

    private static int findMinimum(int[] array) {
        int min=array[0];

        for (int i : array) {
            if (i<min) {
                min=i;
            }
        }
        return min;
    }

    public static void findNumber(int[] array)
     {
        for(int i :array)
    {
        if(i==42)
       {
         System.out.println("Found !!");
         return;
       }
    }
    System.out.println("Not Found!!");
     }
    
}
