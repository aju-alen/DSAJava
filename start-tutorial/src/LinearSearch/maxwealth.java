package LinearSearch;
public class maxwealth {
    public static void main(String[] args) {
        int[][] array ={ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        maximumWealth(array);
    }
    static int maximumWealth (int[][] accounts) {
// person = rol
// account = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
// when you start a new col, take a new sum for that row
            int sum= 0;
            for (int account = 0; account < accounts [person].length; account++) {
                sum += accounts [person] [account];
            }
// now we have sum of accounts of person
// check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}