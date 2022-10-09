package kodlama.io.business.category;

import kodlama.io.business.CommandService;
import kodlama.io.dataAccess.CategoryDao;
import kodlama.io.entities.Category;

public class CategoryAddManager implements CommandService<Category> {

    private final CategoryDao categoryDao;

    public CategoryAddManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public void execute(Category category) throws Exception {
        var result = categoryDao.getAll().stream()
                .anyMatch(c -> c.getName().equalsIgnoreCase(category.getName()));

        if (result)
            throw new Exception("Category name cannot be duplicated");

        this.categoryDao.add(category);
    }
}
