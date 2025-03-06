import java.util.List;

public interface CommentRepository {
    void addComment(Comment comment);
    List<Comment> getCommentsByBlogId(int blogId);
}