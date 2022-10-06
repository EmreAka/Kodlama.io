package kodlama.io.business.category;

import kodlama.io.business.CommandService;
import kodlama.io.dataAccess.CategoryDao;
import kodlama.io.entities.Category;

public class CategoryDeleteManager implements CommandService<Category> {

    private final CategoryDao categoryDao;

    public CategoryDeleteManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public void execute(Category category) throws Exception {
        this.categoryDao.delete(category);
    }
}
