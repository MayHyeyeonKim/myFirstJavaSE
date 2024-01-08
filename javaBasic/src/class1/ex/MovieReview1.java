package class1.ex;

public class MovieReview1 {
    public static void main(String[] args) {
        MovieReview lateAutumn = new MovieReview();
        lateAutumn.title = "Late Autumn";
        lateAutumn.review = "왜 이 사람 포크를 썼어요?";

        MovieReview  decisionToLeave = new MovieReview();
        decisionToLeave.title = "Decision To Leave";
        decisionToLeave.review = "패턴을 좀 알고싶은데요";

        System.out.println("영화 제목: " + lateAutumn.title + ", 리뷰: " + lateAutumn.review);
        System.out.println("영화 제목: " + decisionToLeave.title + ", 리뷰: " + decisionToLeave.review);
    }
}
