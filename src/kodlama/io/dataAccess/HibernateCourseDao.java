package kodlama.io.dataAccess;

import kodlama.io.entities.Course;

import java.util.List;

public class HibernateCourseDao implements CourseDao{
    @Override
    public List<Course> getAll() {
        System.out.println("Courses are listed with Hibernate");
        return InMemoryDatabase.courses;
    }

    @Override
    public void get(int id) {
        System.out.println("Course is listed with Hibernate");
    }

    @Override
    public void add(Course entity) {
        System.out.println("Course is added with Hibernate");
        InMemoryDatabase.courses.add(entity);
    }

    @Override
    public void delete(Course entity) {
        System.out.println("Course is deleted with Hibernate");
    }

    @Override
    public void update(Course entity) {
        System.out.println("Course is update with Hibernate");
    }
}
