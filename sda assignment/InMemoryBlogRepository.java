import java.util.ArrayList;
import java.util.List;

public class InMemoryBlogRepository implements BlogRepository {
    private List<Blog> blogs = new ArrayList<>();

    @Override
    public void addBlog(Blog blog) {
        blogs.add(blog);
    }

    @Override
    public List<Blog> getBlogs() {
        return blogs;
    }

    @Override
    public Blog getBlogById(int blogId) {
        for (Blog blog : blogs) {
            if (blog.getId() == blogId) {
                return blog;
            }
        }
        return null;
    }
}