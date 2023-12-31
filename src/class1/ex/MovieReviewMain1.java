package class1.ex;

public class MovieReviewMain1 {

    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화";

        MovieReview howl = new MovieReview();
        howl.title = "하울의 움직이는 성";
        howl.review = "인생 영화";

        System.out.println("영화 제목: " + inception.title + ", 리뷰: " + inception.review);
        System.out.println("영화 제목: " + aboutTime.title + ", 리뷰: " + aboutTime.review);
        System.out.println("영화 제목: " + howl.title + ", 리뷰: " + howl.review);
    }
}
