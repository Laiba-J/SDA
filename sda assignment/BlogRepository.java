import java.util.List;
public interface BlogRepository {
    void addBlog(Blog blog);
    List<Blog> getBlogs();
    Blog getBlogById(int blogId);
}