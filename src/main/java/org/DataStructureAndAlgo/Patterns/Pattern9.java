package org.DataStructureAndAlgo.Patterns;

public class Pattern9 {

    /*
    *

9.  *********
     *******
      *****
       ***
        *

    *
    *
    * */

    public static void main(String[] args) {
        pattern8(5);
    }

    public static void pattern8(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for (int l=1;l<i;l++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=n-i+1;j++)
            {
                System.out.print("*");
            }
            for (int k=1;k<=n-i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
