package kodlama.io.dataAccess;

import kodlama.io.entities.Course;

public class HibernateCourseDao implements CourseDao{
    @Override
    public void getAll() {
        System.out.println("Courses are listed with Hibernate");
        for (Course course: InMemoryDatabase.courses) {
            System.out.println(course.getName());
        }
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
