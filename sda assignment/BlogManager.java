import java.util.List;

public class BlogManager {
    private BlogRepository blogRepository;

    public BlogManager(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public void addBlog(String title, String content, String category) {
        int id = blogRepository.getBlogs().size() + 1;
        Blog blog = new Blog(id, title, content, category);
        blogRepository.addBlog(blog);
        System.out.println("Blog added successfully!");
    }

    public List<Blog> getBlogs() {
        return blogRepository.getBlogs();
    }

    public Blog getBlogById(int blogId) {
        return blogRepository.getBlogById(blogId);
    }

    public void displayBlogs() {
        List<Blog> blogs = blogRepository.getBlogs();
        if (blogs.isEmpty()) {
            System.out.println("No blog posts available.");
        } else {
            for (Blog blog : blogs) {
                System.out.println("Blog ID: " + blog.getId() + ", Title: " + blog.getTitle());
            }
        }
    }
}