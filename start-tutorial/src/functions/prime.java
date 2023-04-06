package functions;

import java.util.Scanner;

public class prime {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();

        System.out.println("number is  " +prime(number));
    }
    static boolean prime(int num){
        if (num%2==0)return true;
        else return false;

    }
}
