import java.util.ArrayList;
import java.util.List;

public class CommentAdder {
    private List<Comment> comments = new ArrayList<>();

    // Method for adding a comment
    public void addComment(int blogId, String username, String commentText) {
        Comment comment = new Comment(blogId, username, commentText);
        comments.add(comment);
        System.out.println("Comment added successfully!");
    }

    // Get the list of comments
    public List<Comment> getComments() {
        return comments;
    }
}
