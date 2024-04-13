package org.DataStructureAndAlgo.Recursion;

public class FibonacciSeries {

    public static void main(String[] args) {


        //Wap to print fibonaci series
        //Example 0,1,1,2,3,5,8,13,21 ......
        //index   0,1,2,3,4,5,6,7,8,9.......
        int fibonaciSeries = fibonaciSeries(50);
        System.out.println(fibonaciSeries);
    }

    public static int fibonaciSeries(int n )
    {
        if(n<2)
            return n;
        return fibonaciSeries(n-1) + fibonaciSeries(n-2);
    }
}
