package kodlama.io.dataAccess;

import kodlama.io.entities.Category;

public interface CategoryDao {
    void add(Category category);
    void remove(Category category);
    void update(Category category);
    void get(int id);
    void getList();
}
