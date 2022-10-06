package kodlama.io.dataAccess;

import kodlama.io.entities.Course;

public class JdbcCourseDao implements CourseDao{
    @Override
    public void getAll() {
        System.out.println("Courses are listed with Jdbc");
    }

    @Override
    public void get(int id) {
        System.out.println("Course is listed with Jdbc");
    }

    @Override
    public void add(Course entity) {
        System.out.println("Course is added with Jdbc");
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
