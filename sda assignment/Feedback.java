public class Feedback {
    private int blogId;
    private String author;
    private String content;

    public Feedback(int blogId, String author, String content) {
        this.blogId = blogId;
        this.author = author;
        this.content = content;
    }

    public int getBlogId() {
        return blogId;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }
}
