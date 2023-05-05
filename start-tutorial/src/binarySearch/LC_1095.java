package binarySearch;

public class LC_1095 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,3,1};
        int target = 3;
        int result = search(arr,target);
        System.out.println(result);
    }
    static int search(int[] arr ,int target){
        int start = 0;
        int end = arr.length-1;
        int peak = findInMountainArray(arr);
        int firstTry = binarySearch(arr,target,start,peak);
        if(firstTry != -1) return firstTry;
        else {
            return binarySearch(arr,target,peak,end);
        }
    }
    static int findInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + ( end - start) / 2;
            if (start == end) {
                return start;
            }
            else if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            }
            else if(arr[mid] > arr[mid+1]){
                end= mid;
            }

        }
        return -1;
    }
    static int binarySearch(int[] arr,int target,int start, int end) {




        boolean isAsc= arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {return mid;
            }
            //ascending
            else if (isAsc) {
                if(target < arr[mid]){
                    end=mid - 1;
                }else if(target > arr[mid]){
                    start=mid+1;
                }
                //decending
            }else{
                if(target > arr[mid]){
                    end=mid - 1;
                }else if(target < arr[mid]){
                    start=mid+1;
                }
            }
        }



        return -1;

    }
}
