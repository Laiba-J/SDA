
import java.util.Set;
public interface CategoryRepository {
    void addCategory(String category);
    Set<String> getCategories();
}
