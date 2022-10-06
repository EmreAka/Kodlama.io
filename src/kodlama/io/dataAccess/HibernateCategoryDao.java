package kodlama.io.dataAccess;

import kodlama.io.entities.Category;

import java.util.List;

public class HibernateCategoryDao implements CategoryDao{

    @Override
    public List<Category> getAll() {
        return InMemoryDatabase.categories;
    }

    @Override
    public void get(int id) {
        System.out.println("Category is listed with Hibernate");
    }

    @Override
    public void add(Category entity) {
        InMemoryDatabase.categories.add(entity);
    }

    @Override
    public void delete(Category entity) {
        System.out.println("Category is delete with Hibernate");
    }

    @Override
    public void update(Category entity) {
        System.out.println("Category is update with Hibernate");
    }
}
