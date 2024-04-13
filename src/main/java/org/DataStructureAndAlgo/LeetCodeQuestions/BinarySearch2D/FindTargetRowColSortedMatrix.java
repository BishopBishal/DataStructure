package org.DataStructureAndAlgo.LeetCodeQuestions.BinarySearch2D;

public class FindTargetRowColSortedMatrix {

    public static void main(String[] args) {
        int[][] arr = new int[][] {{10,20,30,40},{11,25,35,45},{28,29,37,49},{33,34,38,50}};
        int target=37;
        int[] ans=findInSortedMatrix(target,arr);
        if(ans[0]==-1 && ans[1]==-1)
            System.out.println("Element not found ");
        else
            System.out.println("Element found = arr["+ans[0]+ "]["+ans[1]+"] which is "+arr[ans[0]][ans[1]]);
    }

    private static int[] findInSortedMatrix(int target, int[][] arr) {
        int row=0;
        int col=arr.length-1;
        while (row <= arr.length-1 && col >= 0)
        {
            if(target  < arr[row][col])
            {
                col--;
            } else if (target > arr[row][col]) {
                row++;
            }
            else {
                return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }


}
