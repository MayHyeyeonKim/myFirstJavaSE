package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m=20;
        for(int i=0; i<50; i +=10){
            System.out.println("for m= " + m);
            System.out.println("for i= " + i);
        }
        System.out.println("main m= " + m);
    }
}
