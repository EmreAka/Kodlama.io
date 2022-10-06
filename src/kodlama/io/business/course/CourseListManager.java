package kodlama.io.business.course;

import kodlama.io.business.QueryService;
import kodlama.io.dataAccess.CourseDao;
import kodlama.io.dataAccess.InMemoryDatabase;
import kodlama.io.entities.Course;

public class CourseListManager implements QueryService<Course> {

    private final CourseDao courseDao;

    public CourseListManager(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    @Override
    public void execute() {
        var result = this.courseDao.getAll();
        System.out.println("*************************************************************************************");
        for (Course course: result) {
            System.out.println("Title: "+ course.getName());
            System.out.println("Description: " + course.getDescription());
            System.out.println("*************************************************************************************");
        }
    }
}
