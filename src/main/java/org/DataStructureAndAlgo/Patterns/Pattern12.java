package org.DataStructureAndAlgo.Patterns;

public class Pattern12 {

    /*
    *

12.  * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *


    *
    *
    * */


    public static void main(String[] args) {
            pattern12(5);
    }

    public static void pattern12(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for (int l=1;l<=n-i;l++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i =1;i<=n;i++)
        {
            for (int j=n-i;j>=0;j--)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
            for (int k=1;k<=i;k++)
            {
                System.out.print(" ");
            }
        }
    }
}
