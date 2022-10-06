package kodlama.io.dataAccess;

import kodlama.io.entities.Instructor;

import java.util.List;

public class JdbcInstructorDao implements InstructorDao{
    @Override
    public List<Instructor> getAll() {
        return InMemoryDatabase.instructors;
    }

    @Override
    public void get(int id) {
        System.out.println("Instructors is listed with Jdbc");
    }

    @Override
    public void add(Instructor entity) {
        System.out.println("Instructors is added with Jdbc");
    }

    @Override
    public void delete(Instructor entity) {
        System.out.println("Instructors is deleted with Jdbc");
    }

    @Override
    public void update(Instructor entity) {
        System.out.println("Instructors is updated with Jdbc");
    }
}
