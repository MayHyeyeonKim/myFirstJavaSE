public class ArithmeticOperTest {
    public static void main(String[] args) {
        //Q. 정수의 자릿수 구하기
        int digit = 3625;
        System.out.println(digit%10); //5
        System.out.println(digit/10%10);
        System.out.println(digit/100%10);
        System.out.println(digit/1000%10);

        //짝수(0), 홀수(1) / 배수()
        int su = 5;
        if(su%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
