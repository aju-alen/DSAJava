package functions;

import java.util.Scanner;

public class function1 {
    public static void main(String[] args) {
        int ans= sum(20,30);
        System.out.println("ans "+ans);
    }
    static int sum(int a,int b){
        int sum;
        Scanner in= new Scanner(System.in);

        sum= a+b;
        return sum;
    }
}
