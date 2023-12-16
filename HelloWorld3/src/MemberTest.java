public class MemberTest {
    public static void main(String[] args) {
        //한 명의 짐 회원 데이터를 저장하고 출력하시오.
        Member m=new Member();
        m.name="MayKim";
        m.age=30;
        m.tel="010-0000-1234";
        m.email="ff@gmail.com";
        m.addr="Seoul";
        m.weight=57.6f;
        System.out.println(m.name+"\t"+m.age+"\t"+m.tel+"\t"+m.email+"\t"+m.addr+"\t"+m.weight);
    }
}
