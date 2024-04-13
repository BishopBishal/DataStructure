package org.DataStructureAndAlgo.Patterns;

public class Pattern11 {

    /*
    *

11.  * * * * *
      * * * *
       * * *
        * *
         *

    *
    *
    *
    * */


    public static void main(String[] args) {
        pattern11(5);
    }


    public static void pattern11(int n)
    {
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
