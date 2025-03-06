public class Blog {
    private int id;
    private String title;
    private String content;
    private String category;

    // Constructor to initialize a blog post
    public Blog(int id, String title, String content, String category) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.category = category;
    }

    // Getters for each field (optional)
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getCategory() {
        return category;
    }
}
