import java.util.ArrayList;
import java.util.List;

public class InMemoryFeedbackRepository implements FeedbackRepository {
    private List<Feedback> feedbackList = new ArrayList<>();

    @Override
    public void addFeedback(Feedback feedback) {
        feedbackList.add(feedback);
    }

    @Override
    public List<Feedback> getFeedbackByBlogId(int blogId) {
        List<Feedback> blogFeedback = new ArrayList<>();
        for (Feedback feedback : feedbackList) {
            if (feedback.getBlogId() == blogId) {
                blogFeedback.add(feedback);
            }
        }
        return blogFeedback;
    }
}