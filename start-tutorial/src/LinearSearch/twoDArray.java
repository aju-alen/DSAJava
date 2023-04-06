package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int[][] array={
        {12,31,231,1},
        {3534,5,345},
        {78,67,86786,7}
        };

//        int[][]array= new int[3][3];
//        for (int i = 0; i <array.length ; i++) {
//            for (int j = 0; j <array[i].length ; j++) {
//                System.out.println("Enter elements to add in array");
//                array[i][j]=value.nextInt();
//            }
//
//        }
        System.out.println("Enter the number to find in the array");
        int target=value.nextInt();
        int[] result = two(array,target);
        System.out.println(Arrays.toString(result));
    }
    static int[] two(int[][] arr,int t){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]==t) return new int[]{i,j};
            }

        }
        return null;

    }
}
