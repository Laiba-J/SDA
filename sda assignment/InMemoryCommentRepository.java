import java.util.ArrayList;
import java.util.List;

public class InMemoryCommentRepository implements CommentRepository {
    private List<Comment> comments = new ArrayList<>();

    @Override
    public void addComment(Comment comment) {
        comments.add(comment);
    }

    @Override
    public List<Comment> getCommentsByBlogId(int blogId) {
        List<Comment> blogComments = new ArrayList<>();
        for (Comment comment : comments) {
            if (comment.getBlogId() == blogId) {
                blogComments.add(comment);
            }
        }
        return blogComments;
    }
}
