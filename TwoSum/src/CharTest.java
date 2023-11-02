public class CharTest {
    public static void main(String[] args) {
        char c='A';
        System.out.println("c = " + c);
        int a = 'A';
        System.out.println("a = " + a);
        int b = 'B'+1;
        System.out.println("b = " + b); //67
        System.out.println("char로 바꾼 b = " + (char)b); //67 -> C
        char han ='가';
        System.out.println("han = " + han);
        int hanD='가';
        System.out.println("hanD = " + hanD);
        int hanU='\uAC00';
        System.out.println("char로 바꾼 hanU = " + (char)hanU);
        char upper='A';
        char lower=(char)(upper+32);
        System.out.println("lower = " + lower);
        char lower1 = 'u';
        int upper1=lower1-32;
        System.out.println("upper1 = " + upper1); //85
        System.out.println("char로 바꾼 upper1 = " + (char)upper1);

//        '1'+'2'=3이 나오도록 프로그래밍 하시오.
//        int data='1'+'2';
//        System.out.println("data = " + data); //99
//
//        // '0'의 아스키 코드값이 48
//        char i='1';
//        char j='2';
////      int sum = (i-48)+(j-48);
//        int sum = (i-'0')+(j-'0');
//        System.out.println("sum = " + sum); //3

//        '1'+'2'+'3'+'4'+'5'=15이 나오도록 프로그래밍 하시오.
        char i = '1';
        char j = '2';
        char k = '3';
        char l = '4';
        char m = '5';

        int sum = (i-'0')+(j-'0')+(k-'0')+(l-'0')+(m-'0');

        System.out.println("sum = " + sum);
    }
}
