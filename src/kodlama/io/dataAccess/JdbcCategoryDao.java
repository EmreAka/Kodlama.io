package kodlama.io.dataAccess;

import kodlama.io.entities.Category;

import java.util.List;

public class JdbcCategoryDao implements CategoryDao{

    @Override
    public List<Category> getAll() {
        return InMemoryDatabase.categories;
    }

    @Override
    public void get(int id) {
        System.out.println("Category is listed with Jdbc");
    }

    @Override
    public void add(Category entity) {
        InMemoryDatabase.categories.add(entity);
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
