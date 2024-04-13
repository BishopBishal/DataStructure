package org.DataStructureAndAlgo.Patterns;

public class Pattern6 {

    /*
    *

6.       *
        **
       ***
      ****
     *****

    *
    *
    * */

    public static void main(String[] args) {
        pattern6(5);
    }

    public static void pattern6(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
