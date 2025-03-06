import java.util.Scanner;
public class UserInputHandler {
    private Scanner scanner;
    private BlogPostCreator blogPostCreator;
    private BlogManager blogManager;
    private CommentManager commentManager;  // Add the commentManager field
    private FeedbackManager feedbackManager;  // Add the feedbackManager field

    // Constructor to inject all dependencies, including commentManager and feedbackManager
    public UserInputHandler(Scanner scanner, BlogPostCreator blogPostCreator, BlogManager blogManager, 
                            UserManager userManager, CommentManager commentManager, FeedbackManager feedbackManager) {
        this.scanner = scanner;
        this.blogPostCreator = blogPostCreator;
        this.blogManager = blogManager;
        this.commentManager = commentManager;  // Initialize the commentManager
        this.feedbackManager = feedbackManager;  // Initialize the feedbackManager
    }

    // Method to display the main menu and handle user input
    public boolean displayMainMenu() {
        System.out.println("\n=== Main Menu ===");
        System.out.println("1. Create a new blog post");
        System.out.println("2. View blog posts");
        System.out.println("3. Add feedback to a blog post");
        System.out.println("4. Add comment to a blog post");
        System.out.println("5. Exit");

        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume the newline left over from nextInt

        switch (choice) {
            case 1:
                createBlogPost();  // Call method to create a blog post
                break;
            case 2:
                viewBlogPosts();  // Call method to view blog posts
                break;
            case 3:
                addFeedback();  // Call method to add feedback
                break;
            case 4:
                addComment();  // Call method to add comment
                break;
            case 5:
                return true;  // Exit the program
            default:
                System.out.println("Invalid option. Please try again.");
        }

        return false;  // Continue running the program
    }

    private void createBlogPost() {
        blogPostCreator.createBlogPost(scanner);  // Call createBlogPost from BlogPostCreator
    }

    private void viewBlogPosts() {
        System.out.println("\n=== View All Blog Posts ===");
        blogManager.displayBlogs();  // Display all blog posts
    }

    private void addFeedback() {
        System.out.println("\n=== Add Feedback to Blog Post ===");
        System.out.print("Enter Blog ID to provide feedback: ");
        int blogId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.print("Enter your feedback: ");
        String feedbackText = scanner.nextLine();
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        feedbackManager.addFeedback(blogId, username, feedbackText);  // Add feedback
    }

    private void addComment() {
        System.out.println("\n=== Add Comment to Blog Post ===");
        System.out.print("Enter Blog ID to add comment: ");
        int blogId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.print("Enter your comment: ");
        String commentText = scanner.nextLine();
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        commentManager.addComment(blogId, username, commentText);  // Add comment
    }
}
