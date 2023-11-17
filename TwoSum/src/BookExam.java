public class BookExam {
    public static void main(String[] args) {
        //정수 1개를 저장할 변수를 선언하시오!
        int a;
        a= 10;
        //책 1권을 저장할 변수를 선언하시오.
//        Book b;
//        b=new Book();
        //한 권의 책 데이터를 저장하기 위해서 객체를 생성하시오. (인스턴스를 만드시오.)
        Book b = new Book();
        b.title="java";
        b.price=30000;
        b.company="MayCo";
        b.page=700;
        b.isbn="19191919";
        System.out.println(b.title+"\t"+b.price+"\t"+b.company+"\t"+b.page+"\t"+b.isbn);
    }
}
