package binarySearch;

public class LC_69_Sqrtx {
    public static void main(String[] args) {
        System.out.println(mySqrt(29));
    }
    static int mySqrt(int x) {
        if (x < 2) return x;
        int start = 2;
        int end = x/2;

        while(start <= end){
            int mid = start +(end - start) /2;
            if((long) mid * mid > x){
                end = mid - 1;
            }
            else if ((long) mid * mid < x){
                start = mid + 1;
            }
            else return mid;
        }
        return end;
    }
}
