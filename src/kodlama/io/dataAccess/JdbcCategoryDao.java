package kodlama.io.dataAccess;

import kodlama.io.entities.Category;

public class JdbcCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Category is added with Jdbc");
    }

    @Override
    public void remove(Category category) {
        System.out.println("Category is removed with Jdbc");
    }

    @Override
    public void update(Category category) {
        System.out.println("Category is updated with Jdbc");
    }

    @Override
    public void get(int id) {
        System.out.println("Category is get with Jdbc");
    }

    @Override
    public void getList() {
        System.out.println("Category is listed with Jdbc");
    }
}
