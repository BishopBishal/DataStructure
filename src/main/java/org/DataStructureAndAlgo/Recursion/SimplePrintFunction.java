package org.DataStructureAndAlgo.Recursion;

public class SimplePrintFunction {

    //Print the number from 1 to N

    public static void main(String[] args) {
        printPattern(5);
    }

    public static void printPattern(int n)
    {
        if(n<=0)
            return;

        System.out.print(n);
        System.out.print(" ");
        printPattern(--n);
    }
}
