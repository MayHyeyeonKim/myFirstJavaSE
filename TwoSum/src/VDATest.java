public class VDATest {
    public static void main(String[] args) {
        int v; //변수선언 -> 기억공간
            v= 10;
        System.out.println("v = " + v);
        int a = 10;
        int b  = a;
        int c = b*10;
        System.out.println("c = " + c);
        int sum = 0;
        sum = sum+1;
        sum = sum+2;
        sum = sum+3;
        System.out.println("sum = " + sum);
        int x = 10;
        int y = 20;
        System.out.println("x = " + x + " : " + "y = " + y);
        int tmp;
        tmp = y;
        y = x;
        x = tmp;
        System.out.println("x = " + x + " : " + "y = " + y);
    }
}
