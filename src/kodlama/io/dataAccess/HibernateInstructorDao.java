package kodlama.io.dataAccess;

import kodlama.io.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
    @Override
    public void getAll() {
        System.out.println("Instructors are listed with Hibernate");
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
