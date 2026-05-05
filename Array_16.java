
//Replace each element of the array by its rank in the array
import java.util.*;

public class Array_16 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 15, 30, 25 };
        Solution sol = new Solution();
        int[] rank = sol.arrayrank(arr);
        System.out.println("Original Array: " + Arrays.toString(arr));
    }
}

class Solution {
    public int[] arrayrank(int[] arr) {
        int n = arr.length;
        int[] sortedCopy = arr.clone();
        Arrays.sort(sortedCopy);
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : sortedCopy) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = rankMap.get(arr[i]);
        }

        return arr;
    }
}