package kodlama.io;

import kodlama.io.business.CommandService;
import kodlama.io.business.QueryService;
import kodlama.io.business.course.CourseAddManager;
import kodlama.io.business.course.CourseListManager;
import kodlama.io.core.logging.DatabaseLogger;
import kodlama.io.core.logging.LoggingCommandServiceDecorator;
import kodlama.io.dataAccess.HibernateCourseDao;
import kodlama.io.dataAccess.JdbcCourseDao;
import kodlama.io.entities.Course;

public class Main {
    public static void main(String[] args) throws Exception {
        CommandService<Course> courseAddCommandService =
                new LoggingCommandServiceDecorator<Course>
                        (new CourseAddManager(new JdbcCourseDao()), new DatabaseLogger());

        QueryService<Course> courseListQueryService =
                new CourseListManager(new JdbcCourseDao());

        Course course1 = new Course();
        course1.setName("Emre ile Java'ya doğru.");
        course1.setDescription("Java işte.");
        course1.setPrice(1);

        Course course2 = new Course();
        course2.setName("Emre ile C#'a doğru.");
        course2.setDescription("Microsoft Certified Trainer (MCT) ,PMP ve ITIL sertifikalarına sahibim. Danışmanlık yaptığım kurumların bazıları : Merkez Bankası,TAI, Birleşmiş Milletler,NATO,İş Bankası, Akbank, Halkbank, Vakıfbank, Yapı Kredi Bankası, Ziraat Bankası, Emniyet, Başbakanlık, Cumhurbaşkanlığı, Hazine Müsteşarlığı, Maliye Bakanlığı, Tarım Bakanlığı, Tübitak.");
        course2.setPrice(300);

        courseAddCommandService.execute(course1);
        courseAddCommandService.execute(course2);

        courseListQueryService.execute();
    }
}