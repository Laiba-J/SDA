import java.util.List;
public class CommentDisplay {
    public void displayComments(List<Comment> comments) {
        System.out.println("\n=== Comments for Blog ID ===");
        for (Comment comment : comments) {
            System.out.println(comment.getAuthor() + ": " + comment.getContent());
        }
    }
}
