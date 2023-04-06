package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
String[] names=new String[2];
for (int i = 0;i<names.length;i++){
    names[i]=in.next();
}
        System.out.println(Arrays.toString(names));
    }
}
