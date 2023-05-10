package binarySearch_2d;

import java.util.Arrays;

public class bs2d_code {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30},
                {11,25,35},
                {28,29,37},
                {33,34,38}};

        System.out.println(Arrays.toString(twoD(arr,29)) );
    }
    static int[] twoD(int[][]arr,int target){
        int r = 0;
        int c = arr[r].length - 1;

        while(r < arr.length && c >= 0){
            if(arr[r][c] == target){
                return new int[]{r,c};
            } else if (arr[r][c] < target) {
              r++  ;
            }else{c--;}

        }
        return new int[]{-1,-1};
    }
}
