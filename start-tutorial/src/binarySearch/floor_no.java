package binarySearch;
//Q- Find the floor of a target number (if target is x, find if x
// is present in array else find the greatest  smaller element of x)
public class floor_no {
    public static void main(String[] args){
        int[] array = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int result = floor(array,46);
        System.out.println(result);
    }
    private static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        if(target > arr[end] ) return -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid-1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return arr[mid];
            }

        }

        return arr[end];
    }
}
