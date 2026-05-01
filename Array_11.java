
//Remove duplicates from unsorted array
import java.util.*;

public class Array_11 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr[] = { 3, 2, 6, 5, 4, 5, 1, 2, 3 };
        int newLength = sol.removeDuplicates(arr);
        System.out.println("Length of the array after removing duplicates: " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class Solution {
    public int removeDuplicates(int arr[]) {
        int n = arr.length;
        if (n == 0 || n == 1) {
            return n;
        }
        HashSet<Integer> set = new HashSet<>();
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (set.add(arr[i])) {
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
}
