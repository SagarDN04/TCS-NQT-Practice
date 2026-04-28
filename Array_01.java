
//Find the smallest number in an array
import java.util.*;

public class Array_01 {
    public static void main(String[] args) {
        int[] arr = {4,5,2,3,7};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int small=arr[0];
        System.out.println("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nSmallest Element: " + small);
    }
}