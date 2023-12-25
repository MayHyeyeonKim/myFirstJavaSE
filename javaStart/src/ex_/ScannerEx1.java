package ex_;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Whatchulname: ");
        String name = scanner.nextLine();

        System.out.print("Howoldareyou? ");
        int age = scanner.nextInt();

        System.out.println("Welcome! Your name is " + name + " and your age is " + age );

        scanner.close();
    }
}
