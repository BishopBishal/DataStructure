package  org.DataStructureAndAlgo.LeetCodeQuestions.BinarySearch;

public class BinarySearchSmallestNumber {
     /* 
       * LeetCode Question
       * 
       * 744. Find Smallest Letter Greater Than Target
       * 
       * You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
        Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.
       * 
       * 
       * Example 1:
       * Input: letters = ["c","f","j"], target = "a"
       * Output: "c"
       * Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
       * 
       * 
       * Example 2:
       * Input: letters = ["c","f","j"], target = "c"
       * Output: "f"
       * Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
       * 
       * Example 3:
       * Input: letters = ["x","x","y","y"], target = "z"
       * Output: "x"
       * Explanation: There are no characters in letters that is lexicographically greater than 'z' so we
       * return letters[0].
       */

       public static void main(String[] args) {
        char[] charArray = {'x','x','y','y'};
       char[] charArray2={'c','f','j'};
       char charTarget='f';

       char smallestChar = findLexicographicallyGreater(charArray2,charTarget);
       System.out.println("The smallest character that is lexicographically greater than "+charTarget +" in charArray is "+smallestChar);
       }

       private static char findLexicographicallyGreater(char[] charArray, char charTarget) {
        int start=0;
        int end = charArray.length-1;
        int mid=0;
        while (start<=end) {
         mid=start+((end- start)/2);
         
         if (charArray[mid]>charTarget) {
             end=mid-1;
         }
         else
         {
             start=mid+1;
         }
     }
        return charArray[start%charArray.length];
     }
}
