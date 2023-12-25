package scanner;

import java.util.Scanner;

public class ScannerPlusCond {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Whatcha ur first num? ");
        int num1 = scanner.nextInt();

        System.out.print("whatcha ur second num? ");
        int num2 = scanner.nextInt();

        if (num1 < num2){
            System.out.println("The bigger num is " + num2);
        } else if (num2 < num1){
            System.out.println("The bigger num is " + num1);
        } else {
            System.out.println("Those two nums are the same!");
        }
        scanner.close();
    }
}
