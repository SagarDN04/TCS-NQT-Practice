
//Adding Element in an array beginning, end and at a given position.
import java.util.*;

public class Array_12 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr[] = { 1, 2, 3, 4, 5 };
        int value = 4;
        int pos = 2;
        int[] newArr = sol.addatpos(arr, value, pos);
        System.out.println("Array after adding element at the beginning:");
        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }
}

// Insert at beginning
/*
 * class Solution {
 * public int[] addatbegin(int arr[], int value) {
 * int[] ans = new int[arr.length + 1];
 * ans[0] = value;
 * for (int i = 0; i < arr.length; i++) {
 * ans[i + 1] = arr[i];
 * }
 * return ans;
 * }
 * }
 */

// Insert at end
/*
 * class Solution {
 * public int[] addatend(int arr[], int value) {
 * int ans[] = new int[arr.length + 1];
 * for (int i = 0; i < arr.length; i++) {
 * ans[i] = arr[i];
 * }
 * ans[arr.length] = value;
 * return ans;
 * }
 * }
 */

// Insert at given position

class Solution {
    public int[] addatpos(int arr[], int value, int pos) {
        int ans[] = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            ans[i] = arr[i];
        }
        ans[pos] = value;
        for (int i = pos; i < arr.length; i++) {
            ans[i + 1] = arr[i];
        }
        return ans;
    }
}