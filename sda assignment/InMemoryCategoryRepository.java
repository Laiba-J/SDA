import java.util.HashSet;
import java.util.Set;

public class InMemoryCategoryRepository implements CategoryRepository {
    private Set<String> categories = new HashSet<>();

    @Override
    public void addCategory(String category) {
        categories.add(category);
    }

    @Override
    public Set<String> getCategories() {
        return categories;
    }
}