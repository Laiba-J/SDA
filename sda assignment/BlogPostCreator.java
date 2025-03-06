import java.util.Scanner;

public class BlogPostCreator {
    private BlogManager blogManager;
    private CategoryManager categoryManager;

    public BlogPostCreator(BlogManager blogManager, CategoryManager categoryManager) {
        this.blogManager = blogManager;
        this.categoryManager = categoryManager;
    }

    // Method to create a blog post
    public void createBlogPost(Scanner scanner) {
        System.out.println("\n=== Create New Blog Post ===");

        System.out.println("Available Categories:");
        categoryManager.displayCategories();  // Display available categories

        System.out.print("Enter the category name: ");
        String category = scanner.nextLine();

        System.out.print("Enter the title of the blog: ");
        String title = scanner.nextLine();

        System.out.print("Enter the content of the blog: ");
        String content = scanner.nextLine();

        blogManager.addBlog(title, content, category);
    }
}
