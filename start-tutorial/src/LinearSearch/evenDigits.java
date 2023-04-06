package LinearSearch;

public class evenDigits {
    public static void main(String[] args) {
        int[] nums={12,3,234,3453};
        int result = count(nums);
        System.out.print(result);
    }
    static int count(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num))count++;
        }
        return count;
    }
   static boolean even(int num){
        int add=0;
        while(num>0){
            num= num/10;
            add++;
        }
       return add % 2 == 0;
   }

}
