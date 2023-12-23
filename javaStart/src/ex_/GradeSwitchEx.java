package ex;

/**
 * GradeSwitchEx
 */
public class GradeSwitchEx {
    public static void main(String[] args) {
        String grade = "c";

        switch (grade) {
            case "A":
                System.out.println("Great!");
                break;
            case "B":
                System.out.println("Not bad!");
                break;
            case "C":
                System.out.println("Hummm..");
                break;
            case "D":
                System.out.println("On thin ice!");
                break;
            case "F":
                System.out.println("Fail!");
                break;
        
            default:
            System.out.println("There is no such grade! Enter the correct grade! or Use capital letters.");
                break;
        }
    }
    
}