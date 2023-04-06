package switchCase;

import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner in =new  Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "orange" -> System.out.println("Orange great");
            case "apple" -> System.out.println("Apple great");
            case "Peach" -> System.out.println("Peach great");
            default -> System.out.println("Enter correct data ");
        }



    }
}
