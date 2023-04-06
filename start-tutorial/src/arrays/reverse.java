package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the no of elements in the array");
        int n =in.nextInt();
        int[] arr= new int[n];
        for(int i = 0;i<arr.length;i++){
            System.out.println("Enter element number "+(i+1));
            arr[i]=in.nextInt();
        }
        int[] arr2= reverse(arr);
        System.out.println("final   "+ Arrays.toString(arr2));
    }
    static int[] reverse(int[] arr) {
        if (arr.length > 1) {
            int start = 0;
            int end = arr.length - 1;
            int temp = 0;
            while (start != end && start < end) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

        }
        return arr;
    }
}
