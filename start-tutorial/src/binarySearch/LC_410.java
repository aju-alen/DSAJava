package binarySearch;
//https://leetcode.com/problems/split-array-largest-sum/
public class LC_410 {
    public static void main(String[] args){
        int[] arr = {7,2,5,10,8};
        System.out.println(splitArray(arr,2));
    }
    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int num:nums){
            start = Math.max(start,num);
            end += num;
        }
        while(start < end){
            int mid = start +(end - start) / 2;
            int pieces = 1;
            int sum = 0;

            for(int num:nums){
                if(num + sum <= mid){
                    sum += num;

                }
                else {


                    sum = num;
                    pieces ++;


                }
            }
            if(pieces <= k){
                end = mid;
            }
            else start = mid + 1;
        }


        return end;
    }
}
