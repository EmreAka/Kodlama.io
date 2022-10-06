package kodlama.io.dataAccess;

import kodlama.io.entities.Category;

import java.util.List;

public class JdbcCategoryDao implements CategoryDao{

    @Override
    public List<Category> getAll() {
        System.out.println("Categories are listed with Jdbc");
        return InMemoryDatabase.categories;
    }

    @Override
    public void get(int id) {
        System.out.println("Category is listed with Jdbc");
    }

    @Override
    public void add(Category entity) {
        System.out.println("Category is added with Jdbc");
    }

    @Override
    public void delete(Category entity) {
        System.out.println("Category is deleted with Jdbc");
    }

    @Override
    public void update(Category entity) {
        System.out.println("Category is updated with Jdbc");
    }
}
