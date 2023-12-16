import java.util.Scanner;
public class IfbasicTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("what is your age? ");
        int age = scan.nextInt();
        if (age >=19){
            System.out.println("You are good to go!");
        }
        System.out.println("Done!");
    }
}
