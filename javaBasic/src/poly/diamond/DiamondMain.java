package poly.diamond;

public class DiamondMain {

    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();

        Child c = new Child(); //Child에 바로 감
        c.methodCommon();
    }
}
