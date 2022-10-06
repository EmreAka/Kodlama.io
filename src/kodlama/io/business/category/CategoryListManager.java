package kodlama.io.business.category;

import kodlama.io.business.QueryService;
import kodlama.io.dataAccess.CategoryDao;
import kodlama.io.entities.Category;

public class CategoryListManager implements QueryService<Category> {

    private final CategoryDao categoryDao;

    public CategoryListManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public void execute() {
        var result = this.categoryDao.getAll();
        for(Category category: result){
            System.out.println("Category name: "+ category.getName());
            System.out.println("*************************************************************************************");
        }
    }
}
