package kodlama.io.business.course;

import kodlama.io.business.QueryService;
import kodlama.io.dataAccess.CourseDao;
import kodlama.io.entities.Course;

public class CourseListManager implements QueryService<Course> {

    private final CourseDao courseDao;

    public CourseListManager(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    @Override
    public void execute() {
        this.courseDao.getAll();
    }
}
