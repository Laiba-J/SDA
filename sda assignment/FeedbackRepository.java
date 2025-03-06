import java.util.List; public interface FeedbackRepository {
    void addFeedback(Feedback feedback);
    List<Feedback> getFeedbackByBlogId(int blogId);
}