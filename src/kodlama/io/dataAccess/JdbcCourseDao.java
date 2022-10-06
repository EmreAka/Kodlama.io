package kodlama.io.dataAccess;

import kodlama.io.entities.Course;

import java.util.List;

public class JdbcCourseDao implements CourseDao{
    @Override
    public List<Course> getAll() {
        System.out.println("Courses are listed with Jdbc");
        return InMemoryDatabase.courses;
    }

    @Override
    public void get(int id) {
        System.out.println("Course is listed with Jdbc");
    }

    @Override
    public void add(Course entity) {
        System.out.println("Course is added with Jdbc");
        InMemoryDatabase.courses.add(entity);
    }

    @Override
    public void delete(Course entity) {
        System.out.println("Course is deleted with Jdbc");
    }

    @Override
    public void update(Course entity) {
        System.out.println("Course is update with Jdbc");
    }
}
