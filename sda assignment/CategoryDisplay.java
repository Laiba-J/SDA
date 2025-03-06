import java.util.Set;


public class CategoryDisplay  {
    public void displayCategories(Set<String> categories) {
        if (categories.isEmpty()) {
            System.out.println("No categories available.");
            return;
        }
        for (String category : categories) {
            System.out.println("- " + category);
        }
    }
}
