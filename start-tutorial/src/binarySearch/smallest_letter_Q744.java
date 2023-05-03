package binarySearch;
//Q- Find the ceiling of a target number (if target is x, find if x
// is present in array else find the smallest greater element of x)
public class smallest_letter_Q744 {
    public static void main(String[] args){
        char[] array = {'a','c','e','g'} ;
        int result = smallestLetter(array,'g');

        System.out.println(result);
    }
    private static int smallestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;


        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < letters[mid]){
                end = mid-1;
            }
            else   {
                start = mid + 1;
            }


        }

        return letters[start % letters.length];
    }
}
