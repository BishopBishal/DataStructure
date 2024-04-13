package org.DataStructureAndAlgo.Patterns;

public class Pattern7 {

    /*
    *
    *

7.   *****
      ****
       ***
        **
         *


    *
    * */

    public static void main(String[] args) {
        pattern7(5);
    }

    public static void pattern7(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=n+1-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            for (int k=1;k<=i;k++)
            {
                System.out.print(" ");
            }

        }
    }
}
