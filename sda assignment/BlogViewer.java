import java.util.List;
public class BlogViewer {
    private BlogManager blogManager;

    public BlogViewer(BlogManager blogManager) {
        this.blogManager = blogManager;
    }

    // Display all blogs
    public void viewAllBlogs() {
        List<Blog> blogs = blogManager.getBlogs(); // Get the list of all blogs
        if (blogs.isEmpty()) {
            System.out.println("No blogs available.");
            return;
        }
        for (Blog blog : blogs) {
            System.out.println("ID: " + blog.getId() + " | Title: " + blog.getTitle());
        }
    }
}
