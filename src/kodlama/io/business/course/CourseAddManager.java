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
    public void execute(Course course) throws Exception{
        var result =courseDao.getAll().stream().anyMatch(c -> c.getName().equalsIgnoreCase(course.getName()));

        if (result)
            throw new Exception("Course name cannot be duplicated");

        this.courseDao.add(course);
    }
}
