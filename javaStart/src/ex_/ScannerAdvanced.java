package ex_;

import java.util.Scanner;

public class ScannerAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Num is ");
        int num1 = scanner.nextInt();

        System.out.print("Second Num is ");
        int num2 = scanner.nextInt();

        if (num2<num1){ //2<5
            int temp = num1; //5
            num1 = num2; //2
            num2 = temp; //5
        }

        System.out.print("All ints between the two nums are... ");
        for(int i = num1; i<=num2; i++){
            System.out.print(i);
            if (i != num2) {
                System.out.print(", ");
        
        scanner.close();
            }
        }
    }
}
