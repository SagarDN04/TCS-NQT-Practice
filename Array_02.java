//Find the largest number in an array
import java.util.*;
public class Array_02{
    public static void main(String[] args){ 
        int arr[]={6,3,4,2,9};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int large=arr[arr.length-1];
        System.out.println("Sorted array=");
        for(int num:arr){
            System.out.print(num + " ");
        }
        System.out.println("\nlargest Element: " + large);
    }
}