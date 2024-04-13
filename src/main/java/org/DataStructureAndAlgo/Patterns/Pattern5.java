package org.DataStructureAndAlgo.Patterns;

public class Pattern5 {

    /*
    *
    *
    *

 5.  *
     **
     ***
     ****
     *****
     ****
     ***
     **
     *


    * */


    public static void main(String[] args) {
        pattern5(6);
    }

    public static void pattern5(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++)
        {
            for (int j=n-1;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
