package kodlama.io.dataAccess;

import kodlama.io.entities.Category;

public class HibernateCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Category is added with Hibernate");
    }

    @Override
    public void remove(Category category) {
        System.out.println("Category is removed with Hibernate");
    }

    @Override
    public void update(Category category) {
        System.out.println("Category is updated with Hibernate");
    }

    @Override
    public void get(int id) {
        System.out.println("Category is get with Hibernate");
    }

    @Override
    public void getList() {
        System.out.println("Category is listed with Hibernate");
    }
}
