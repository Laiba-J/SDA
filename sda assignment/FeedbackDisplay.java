import java.util.List;
public class FeedbackDisplay {
    public void displayFeedback(List<Feedback> feedbackList) {
        System.out.println("\n=== Feedback for Blog ID ===");
        for (Feedback feedback : feedbackList) {
            System.out.println(feedback.getAuthor() + ": " + feedback.getContent());
        }
    }
}
