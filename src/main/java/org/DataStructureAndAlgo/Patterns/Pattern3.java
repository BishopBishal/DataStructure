package org.DataStructureAndAlgo.Patterns;

public class Pattern3 {

    /*
    *
    *
    *
 3.  *****
     ****
     ***
     **
     *
    *
    * */

    public static void main(String[] args) {
        pattern3();
    }


    public static void pattern3()
    {
        for(int i=0;i<5;i++)
        {
            for (int j=i;j<5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
