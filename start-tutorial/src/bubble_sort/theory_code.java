package bubble_sort;

import java.util.Arrays;

public class theory_code {
    public static void main(String[] args) {
    int [] arr = {5,4,3,2,1};
    bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            boolean check = false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    check = true;

                }

            }
            if(!check){
                break;
            }

        }
    }
}
