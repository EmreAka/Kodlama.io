package kodlama.io.dataAccess;

import kodlama.io.entities.Category;

import java.util.List;

public class HibernateCategoryDao implements CategoryDao{

    @Override
    public void getAll() {
        System.out.println("Categories are listed with Hibernate");

    }

    @Override
    public void get(int id) {
        System.out.println("Category is listed with Hibernate");

    }

    @Override
    public void add(Category entity) {
        System.out.println("Category is added with Hibernate");
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
