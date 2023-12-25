package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10;
        if(true){
            int x=20;
            System.out.println("if m = " + m);
            System.out.println("if x= " + x);
        }
        System.out.println("main m= " + m);
    }
}

//변수할당할 때 코드 블록안에서만 필요하면 거기 안에서만 생존하게 하기, 이유는 코드 블럭 밖에 있으면 불필요한 메모리가 낭비되고, 코드가 복잡해 보이기 때문에.