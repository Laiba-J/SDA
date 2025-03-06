import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize repositories
        BlogRepository blogRepository = new InMemoryBlogRepository();
        CategoryRepository categoryRepository = new InMemoryCategoryRepository();
        CommentRepository commentRepository = new InMemoryCommentRepository();
        FeedbackRepository feedbackRepository = new InMemoryFeedbackRepository();
        UserRepository userRepository = new InMemoryUserRepository();

        // Initialize managers with repositories
        BlogManager blogManager = new BlogManager(blogRepository);
        CategoryManager categoryManager = new CategoryManager(categoryRepository);
        CommentManager commentManager = new CommentManager(commentRepository);
        FeedbackManager feedbackManager = new FeedbackManager(feedbackRepository);
        UserManager userManager = new UserManager(userRepository);

        // Register a new user
        System.out.println("=== Register a New User ===");
        userManager.registerUser(scanner);

        // Create a blog post
        BlogPostCreator blogPostCreator = new BlogPostCreator(blogManager, categoryManager);
        blogPostCreator.createBlogPost(scanner);

        // Main menu
        while (true) {
            System.out.println("\n=== Main Menu ===");
            System.out.println("1. View all blog posts");
            System.out.println("2. Add feedback to a blog post");
            System.out.println("3. Add comment to a blog post");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline left by nextInt

            switch (choice) {
                case 1:
                    blogManager.displayBlogs();
                    break;
                case 2:
                    addFeedback(scanner, blogManager, feedbackManager, userManager);
                    break;
                case 3:
                    addComment(scanner, blogManager, commentManager, userManager);
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addFeedback(Scanner scanner, BlogManager blogManager, FeedbackManager feedbackManager, UserManager userManager) {
        System.out.print("Enter Blog ID to provide feedback: ");
        int blogId = scanner.nextInt();
        scanner.nextLine();  // Consume the newline left by nextInt

        System.out.print("Enter your feedback: ");
        String feedbackText = scanner.nextLine();

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        feedbackManager.addFeedback(blogId, username, feedbackText);
    }

    private static void addComment(Scanner scanner, BlogManager blogManager, CommentManager commentManager, UserManager userManager) {
        System.out.print("Enter Blog ID to add comment: ");
        int blogId = scanner.nextInt();
        scanner.nextLine();  // Consume the newline left by nextInt

        System.out.print("Enter your comment: ");
        String commentText = scanner.nextLine();

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        commentManager.addComment(blogId, username, commentText);
    }
}