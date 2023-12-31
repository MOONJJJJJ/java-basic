package class1.ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[3];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
        reviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화";
        reviews[1] = aboutTime;

        MovieReview howl = new MovieReview();
        howl.title = "하울의 움직이는 성";
        howl.review = "인생 영화";
        reviews[2] = howl;

        for (MovieReview review : reviews) {
            System.out.println("영화 제목: " + review.title + ", 리뷰: " + review.review);
        }
    }
}
