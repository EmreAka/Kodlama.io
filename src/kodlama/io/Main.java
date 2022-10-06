package kodlama.io;

import kodlama.io.business.CommandService;
import kodlama.io.business.course.CourseAddManager;
import kodlama.io.core.logging.DatabaseLogger;
import kodlama.io.core.logging.LoggingCommandServiceDecorator;
import kodlama.io.dataAccess.JdbcCourseDao;
import kodlama.io.entities.Course;

public class Main {
    public static void main(String[] args) throws Exception {
        CommandService<Course> courseAddCommandService =
                new LoggingCommandServiceDecorator<Course>
                        (new CourseAddManager(new JdbcCourseDao()), new DatabaseLogger());

        Course course = new Course();
        course.setName("Java");
        course.setPrice(-1);

        courseAddCommandService.Execute(course);
    }
}