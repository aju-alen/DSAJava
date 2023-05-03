package binarySearch;

public class binary {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
      int result = binarySearch(arr, 6);
      System.out.println(result);
    }

    private static int binarySearch(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end= mid - 1;
            }
            else if (target > arr[mid]) {
                start= mid + 1;
            }
            else return mid;
        }
        return -1;
    }

}
