package test;

import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("type num1");
        int num1= input.nextInt();
        System.out.println("type num2");
        float num2= input.nextInt();
        float sum = num1+num2;
        System.out.println("Sum = " +sum);
        byte a=50;
        byte b =(byte)(a*2);
    }
}
