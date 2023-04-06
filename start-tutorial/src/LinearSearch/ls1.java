package LinearSearch;

public class ls1 {
    public static void main(String[] args) {
int[] array = {1,434,356,4564,2,341,2342123,42,35,234,34,23,4};
int n=422 ;
boolean result = linearSearch(array,n);
        System.out.println(result);
    }
    static boolean linearSearch(int[] arr,int target){

        int index = 0;
        while (index<arr.length) {
            if (arr[index]==target){
                return true;
            }

            index++;
        }
        return false;
    }
}
