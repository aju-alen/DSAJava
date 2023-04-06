package condionalLoops;

import java.util.Scanner;

public class stringToChar {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        char word= string.next().trim().charAt(0);
        System.out.println(word);
    }
}
