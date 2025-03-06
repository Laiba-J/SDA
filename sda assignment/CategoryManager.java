import java.util.Set;

public class CategoryManager {
    private CategoryRepository categoryRepository;

    public CategoryManager(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
        // Initialize default categories
        categoryRepository.addCategory("Technology");
        categoryRepository.addCategory("Lifestyle");
        categoryRepository.addCategory("Health");
    }

    public void displayCategories() {
        Set<String> categories = categoryRepository.getCategories();
        if (categories.isEmpty()) {
            System.out.println("No categories available.");
        } else {
            for (String category : categories) {
                System.out.println("- " + category);
            }
        }
    }
}