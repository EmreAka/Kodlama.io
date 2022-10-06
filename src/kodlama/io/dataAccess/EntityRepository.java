package kodlama.io.dataAccess;

import java.util.List;

public interface EntityRepository<T> {
    void getAll();
    void get(int id);
    void add(T entity);
    void delete(T entity);
    void update(T entity);
}
