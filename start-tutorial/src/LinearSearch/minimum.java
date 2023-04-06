package LinearSearch;

public class minimum {
    public static void main(String[] args) {
        int[] array={1,2,2134,32,423,2,5235,234,23,4};
        int result = minimum(array);
        System.out.println(result);
    }
        static int minimum(int[] arr){
        int i =0;
       int temp=arr[0];
        while(i<arr.length){
            if(temp<arr[i]) temp=arr[i];
            i++;
        }
        return temp;
        }
}
