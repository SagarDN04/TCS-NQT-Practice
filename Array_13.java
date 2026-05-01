
//Removing Element in an array beginning, end and at a given position.
import java.util.*;

public class Array_13 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 3, 56, 3 };
        Solution sol = new Solution();
        int pos = 2;
        int[] newArr = sol.removeAtPos(arr, pos);
        System.out.println(Arrays.toString(newArr));

    }
}

// Remove from beginning
/*
 * class Solution {
 * public int[] removeBeginning(int[] arr) {
 * if (arr.length == 0)
 * return arr;
 * int[] newArr = new int[arr.length - 1];
 * for (int i = 1; i < arr.length; i++) {
 * newArr[i - 1] = arr[i]; // Copy everything shifted one spot left
 * }
 * return newArr;
 * }
 * }
 */

// Remove from end
/*
 * class Solution {
 * public int[] removeEnd(int[] arr) {
 * if (arr.length == 0)
 * return arr;
 * int[] newArr = new int[arr.length - 1];
 * for (int i = 0; i < arr.length - 1; i++) {
 * newArr[i] = arr[i]; // Copy everything up to the last element
 * }
 * return newArr;
 * }
 * }
 */

// Remove from given position
class Solution {
    public int[] removeAtPos(int[] arr, int pos) {
        if (arr.length == 0 || pos < 0 || pos >= arr.length)
            return arr;
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i]; // Copy elements before the position
        }
        for (int i = pos + 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i]; // Copy elements after the position shifted one spot left
        }
        return newArr;
    }
}