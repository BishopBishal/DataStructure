package org.DataStructureAndAlgo.Patterns;

public class Pattern2 {

    /*
    *
    *
    *
    *
 2.  *
     **
     ***
     ****
     *****
    *
    * */

    public static void main(String[] args) {
        pattern2();
    }

    public static void pattern2()
    {
        for(int i=0;i<5;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
