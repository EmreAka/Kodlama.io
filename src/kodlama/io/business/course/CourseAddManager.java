package kodlama.io.business.course;

import kodlama.io.business.CommandService;
import kodlama.io.dataAccess.CourseDao;
import kodlama.io.entities.Course;

public class CourseAddManager implements CommandService<Course> {
    private CourseDao courseDao;

    public CourseAddManager(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    @Override
    public void Execute(Course course) {
        this.courseDao.add(course);
    }
}
