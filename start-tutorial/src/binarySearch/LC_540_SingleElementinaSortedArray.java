package binarySearch;

public class LC_540_SingleElementinaSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(singleNonDuplicate(arr));


    }
    static int singleNonDuplicate(int[] nums) {
        if(nums.length<3){
            return nums[0];
        }
        int start = 0;
        int end = nums.length-1;


        while(start <= end ){
            int mid = start + (end - start ) / 2;
            if(start == end && end == mid ){
              return  nums[mid];
            }
            else if(nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1] ){
                return nums[mid];
            }
            else if(nums[mid] == nums[mid-1]){
                if ((start + mid -2) % 2 == 0){
                    end = mid -2;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if ((start + mid -1) % 2 == 0){
                    end = mid -1;
                }
                else {
                    start = mid + 2;
                }
            }

        }
        return -1;
    }
}
