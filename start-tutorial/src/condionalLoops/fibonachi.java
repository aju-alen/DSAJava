package condionalLoops;

import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args){
        int a =0;
        int b=1;
        int sum = 0;
        Scanner number = new Scanner(System.in);
        int n= number.nextInt();
        for(int i = 0;i<=n-2;i++){
            sum=a+b;
            a=b;
            b=sum;

        }
        System.out.println(sum);

    }
}
