package kodlama.io;

import kodlama.io.business.CommandService;
import kodlama.io.business.course.CourseAddManager;
import kodlama.io.core.logging.DatabaseLogger;
import kodlama.io.core.logging.LoggingCommandServiceDecorator;
import kodlama.io.dataAccess.HibernateCourseDao;
import kodlama.io.dataAccess.JdbcCourseDao;
import kodlama.io.entities.Course;

public class Main {
    public static void main(String[] args) throws Exception {
        CommandService<Course> courseAddCommandService =
                new LoggingCommandServiceDecorator<Course>
                        (new CourseAddManager(new HibernateCourseDao()), new DatabaseLogger());

        Course course1 = new Course();
        course1.setName("Java");
        course1.setPrice(1);

        Course course2 = new Course();
        course2.setName("C#");
        course2.setPrice(300);

        courseAddCommandService.execute(course1);
        courseAddCommandService.execute(course2);

        HibernateCourseDao test = new HibernateCourseDao();
        test.getAll();
    }
}