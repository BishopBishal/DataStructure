package org.datastructure.Algorithms;

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
