package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your word!: ");
        String str = scanner.nextLine(); 
        System.out.println("Your word is " + str);
        System.out.println();

        System.out.print("Enter your int: ");
        int intValue = scanner.nextInt();
        System.out.println("Your int is " + intValue);
        System.out.println();

        System.out.print("Enter your double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("Your double is: " + doubleValue);
        System.out.println();

        scanner.close();
    }
}
