package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        System.out.println("dataA=" + dataA);
        changeReference(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value);
    }

    static void changeReference(Data dataX) {
        System.out.println("dataX=" + dataX);
        dataX.value = 20;
    }
}
//기본형: 메서드로 기본형 데이터를 전달하면, 해당 값이 복사되어 전달된다. 이 경우, 메서드 내부에서 매개변수 (파라미터)의 값을 변경해도, 호출자의 변수 값에는 영향이 없다.
//종이 두 장에 10을 적고, 한쪽 종이의 값을 10에서 20으로 수정한다해도 다른 한쪽 종이는 여전히 10인상태
//참조형: 메서드로 참조형 데이터를 전달하면, 참조값이 복사되어 전달된다. 이 경우, 메서드 내부에서 매개변수(파라미터)로 전달된 객체의 멤버 변수를 변경하면, 호출자의 객체도 변경된다.
//원본에 적혀 있는 주소를 받아적어서, 그 받아 적은 종이에 주소를 보고 그 곳을 찾아가서 수정하면 원본 종이의 주소지에 있는 그 건물도 바뀌어 있는 모습
