package org.DataStructureAndAlgo.Patterns;

public class Pattern1 {

    /*
    * https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
    *
    *
   1.*****
     *****
     *****
     *****
     *****
    *
    * */

    public static void main(String[] args) {
        pattern1();
    }

    public static void pattern1()
    {
        for(int i =0;i<5;i++)
        {
            for (int j=0;j<5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
