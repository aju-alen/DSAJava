package binarySearch;
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//If target is not found in the array, return [-1, -1].
//
//You must write an algorithm with O(log n) runtime complexity.
public class LeetCode_Q_34 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,7,8,8,9};
        int[] result = searchRange(array,8);
        System.out.println(result);
    }
    static private  int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1}; // return this if no is not present
        int start = search( nums, 8,true); // do this function to find start position
        int end  = search( nums, 8,false); // do this function to find end position
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    private static int search(int[] nums, int target, boolean firstIdx){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end= mid - 1;
            }
            else if (target > nums[mid]) {
                start= mid + 1;
            }
            else {
                ans= mid;
                if(firstIdx){ //to find start
                    end = mid - 1;
                }
                else {
                    start = mid + 1; // to find end
                }
            }
        }
        return ans;
    }
}
