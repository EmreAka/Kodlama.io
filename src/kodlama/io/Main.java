package kodlama.io;

import kodlama.io.business.CommandService;
import kodlama.io.business.course.CourseAddManager;
import kodlama.io.core.logging.LoggingCommandServiceDecorator;
import kodlama.io.dataAccess.HibernateCourseDao;
import kodlama.io.entities.Course;

public class Main {
    public static void main(String[] args) {
        CommandService<Course> courseAddCommandService =
                new LoggingCommandServiceDecorator<Course>(new CourseAddManager(new HibernateCourseDao()));

        Course course = new Course();
        course.setName("Java");

        courseAddCommandService.Execute(course);
    }
}