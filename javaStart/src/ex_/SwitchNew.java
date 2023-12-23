package ex_;

public class SwitchNew {
    public static void main(String[] args) {
        int grade = 2;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        System.out.println("Your coupon is " + coupon);
    }
}

// This switch expression feature available in Java12 and later.