import java.util.Scanner;
public class ScannerExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("title: ");
        String title = scan.nextLine();
        System.out.println("title = " + title);

        System.out.print("price: ");
        int price = scan.nextInt();
        System.out.println("price = " + price);

        scan.nextLine();

        System.out.print("company: ");
        String company = scan.nextLine();
        System.out.println("company = " + company);

        scan.close();

    }
}
