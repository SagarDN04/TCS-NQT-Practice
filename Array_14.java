
//Find all repeating elements in an array
import java.util.*;

public class Array_14 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr[] = { 1, 2, 3, 4, 5, 2, 3 };
        int[] repeatingElements = sol.findRepeatingElements(arr);
        System.out.println("Repeating elements in the array");

    }
}

class Solution {
    public int[] findRepeatingElements(int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }
        return new int[0];
    }
}