import java.util.List;

public class FeedbackManager {
    private FeedbackRepository feedbackRepository;

    public FeedbackManager(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    public void addFeedback(int blogId, String username, String feedbackText) {
        Feedback feedback = new Feedback(blogId, username, feedbackText);
        feedbackRepository.addFeedback(feedback);
        System.out.println("Feedback added successfully!");
    }

    public List<Feedback> getFeedback(int blogId) {
        return feedbackRepository.getFeedbackByBlogId(blogId);
    }
}
