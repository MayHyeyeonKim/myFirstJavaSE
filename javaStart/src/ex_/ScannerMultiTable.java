package ex_;

import java.util.Scanner;

public class ScannerMultiTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력하세요: ");
        int n = input.nextInt();

        System.out.println(n + "단의 구구단: ");
        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " x " + i + " = " + n * i);

            input.close();
        }
    }
}
