package class1.ex;

public class MovieReview2 {
    public static void main(String[] args) {

        MovieReview[] reviews = new MovieReview[2];

        MovieReview lateAutumn = new MovieReview();
        lateAutumn.title = "Late Autumn";
        lateAutumn.review = "왜 이 사람 포크를 썼어요?";
        reviews[0] = lateAutumn;

        MovieReview  decisionToLeave = new MovieReview();
        decisionToLeave.title = "Decision To Leave";
        decisionToLeave.review = "패턴을 좀 알고싶은데요";
        reviews[1] = decisionToLeave;

        for (MovieReview review : reviews) {
            System.out.println("Movie title: " + review.title + "review: " + review.review);
        }
    }
}
