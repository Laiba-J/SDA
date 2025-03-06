import java.util.List;

public class CommentManager {
    private CommentRepository commentRepository;

    public CommentManager(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void addComment(int blogId, String username, String commentText) {
        Comment comment = new Comment(blogId, username, commentText);
        commentRepository.addComment(comment);
        System.out.println("Comment added successfully!");
    }

    public List<Comment> getComments(int blogId) {
        return commentRepository.getCommentsByBlogId(blogId);
    }
}