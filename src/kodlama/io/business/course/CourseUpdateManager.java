package kodlama.io.business.course;

import kodlama.io.business.CommandService;
import kodlama.io.dataAccess.CourseDao;
import kodlama.io.entities.Course;

public class CourseUpdateManager implements CommandService<Course> {
    private CourseDao courseDao;

    public CourseUpdateManager(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    @Override
    public void execute(Course course) {
        this.courseDao.update(course);
    }
}
