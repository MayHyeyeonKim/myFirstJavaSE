package ex_;

public class ExchangeRateEx {
    public static void main(String[] args) {
        int dollar = -20;

        if(dollar<0){
            System.out.println("Are you kidding me!");
        } else if(dollar == 0){
            System.out.println("You do not hava any money to exchange.");
        } else {
            int won = dollar * 1300;
            System.out.println("The amount to exchange is: " + won + " KRW");
            
        }
    }
}
