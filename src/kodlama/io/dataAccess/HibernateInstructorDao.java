package kodlama.io.dataAccess;

import kodlama.io.entities.Instructor;

import java.util.List;

public class HibernateInstructorDao implements InstructorDao{
    @Override
    public List<Instructor> getAll() {
        System.out.println("Instructors are listed with Hibernate");
        return InMemoryDatabase.instructors;
    }

    @Override
    public void get(int id) {
        System.out.println("Instructors is listed with Hibernate");
    }

    @Override
    public void add(Instructor entity) {
        System.out.println("Instructors is added with Hibernate");
    }

    @Override
    public void delete(Instructor entity) {
        System.out.println("Instructors is deleted with Hibernate");
    }

    @Override
    public void update(Instructor entity) {
        System.out.println("Instructors is updated with Hibernate");
    }
}
