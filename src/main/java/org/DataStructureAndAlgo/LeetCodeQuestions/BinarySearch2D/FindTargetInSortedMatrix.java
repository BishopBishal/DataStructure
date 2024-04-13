package org.DataStructureAndAlgo.LeetCodeQuestions.BinarySearch2D;

public class FindTargetInSortedMatrix {

    public static void main(String[] args) {
        int[][] arr= new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        for (int i=0;i< arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                System.out.println("Arr["+i+"]["+j+"] = "+arr[i][j]);
            }
        }
        int target=12;
        int answer = FindTargetInArray(arr, -1);
        System.out.println("Found Answer = "+answer);
    }


    public static int FindTargetInArray(int[][] arr,int target)
    {
        int rowStart=0;
        int rowEnd=arr.length-1;
        int colStart=0;
        int colEnd=arr.length-1;
        while(rowEnd-rowStart>=2)
        {
            int rowMid =rowStart+(rowEnd-rowStart)/2;
            int colMid=colStart+(colEnd-colStart)/2;
            if(arr[rowMid][colMid]==target)
            {
                return arr[rowMid][colMid];
            } else if (arr[rowMid][colMid]>target) {
                rowEnd=rowMid;
            }
            else
            {
                rowStart=rowMid;
            }
        }
        int rowMid =rowStart+(rowEnd-rowStart)/2;
        int colMid=colStart+(colEnd-colStart)/2;
        if(arr[rowMid][colMid]==target)
        {
            return arr[rowMid][colMid];
        }
        if(arr[rowMid+1][colMid] == target)
        {
            return arr[rowMid+1][colMid];
        }

        int ans = BinarySearch(rowMid, 0, colMid - 1, arr, target);
        if(ans!=-1)
            return ans;

        ans=BinarySearch(rowMid,colMid+1,arr.length-1,arr,target);
        if(ans!=-1)
            return ans;
          ans=BinarySearch(rowMid+1,0,colMid-1,arr,target);
          if(ans!=-1)
              return ans;
          ans=BinarySearch(rowMid+1,colMid+1,arr.length-1,arr,target);
          return ans;
    }

    public static int BinarySearch(int row,int colStart,int colEnd,int[][] arr,int target)
    {
        while(colStart<=colEnd)
        {
            int mid =colStart+(colEnd-colStart)/2;
            if(arr[row][mid] < target)
            {
                colStart=mid+1;
            }
            else if (arr[row][mid] > target)
            {
                colEnd=mid-1;
            }
            else
            {
                return arr[row][mid];
            }
        }
        return -1;
    }
}
