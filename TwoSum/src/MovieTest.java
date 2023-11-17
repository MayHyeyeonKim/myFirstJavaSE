public class MovieTest  {
    public static void main(String[] args) {
        //아래에 예시된 한 편의 영화 데이터를 저장하고 출력하시오.
        Movie mv=new Movie();
        mv.mtitle="Avatar";
        mv.mday="2022.12.14";
        mv.mmajor="Jake";
        mv.mpart="Action";
        mv.mtime=192;
        mv.mlevel=12;
        System.out.println(mv.mtitle+"\t"+mv.mday+"\t"+mv.mpart+"\t"+mv.mpart+"\t"+mv.mtime+"\t"+mv.mlevel);
    }
}
