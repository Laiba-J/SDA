public class BlogPost {
    public String title;
    public String author;
    public String content;
    public String tags;
    public CommentManager comments;
    public BlogPost next;

    public BlogPost(String title, String author, String content, String tags, BlogPost next) {
        this.title = title;
        this.author = author;
        this.content = content;
        this.tags = tags;
        this.comments = new CommentManager(null);
        this.next = next;
    }
}
