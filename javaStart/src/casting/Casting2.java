package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue; //compile err!
        intValue = (int)doubleValue; //명시적형변환 explicit type casting
        System.out.println(intValue);

        System.out.println(10.5);
        System.out.println((int)10.5);
    }
}
//큰데이타타입->작은데이타타입으로 가는거 허용하지 않음!
//형변환한다고 해서 그 자체의 타입이 변경되는 건 아니고 프린트만 바뀌는 것!
