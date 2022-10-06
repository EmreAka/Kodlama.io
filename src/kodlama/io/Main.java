package kodlama.io;

import kodlama.io.business.CommandService;
import kodlama.io.business.QueryService;
import kodlama.io.business.category.CategoryAddManager;
import kodlama.io.business.category.CategoryListManager;
import kodlama.io.business.course.CourseAddManager;
import kodlama.io.business.course.CourseListManager;
import kodlama.io.business.instructor.InstructorAddManager;
import kodlama.io.business.instructor.InstructorListManager;
import kodlama.io.core.logging.DatabaseLogger;
import kodlama.io.core.logging.FileLogger;
import kodlama.io.core.logging.LoggingCommandServiceDecorator;
import kodlama.io.core.logging.LoggingQueryServiceDecorator;
import kodlama.io.dataAccess.*;
import kodlama.io.entities.Category;
import kodlama.io.entities.Course;
import kodlama.io.entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        //COURSE
        CommandService<Course> courseAddCommandService =
                new LoggingCommandServiceDecorator<Course>
                        (new CourseAddManager(new JdbcCourseDao()), new DatabaseLogger());

        QueryService<Course> courseListQueryService =
                new LoggingQueryServiceDecorator<Course>
                        (new CourseListManager(new JdbcCourseDao()), new DatabaseLogger());


        //CATEGORY
        CommandService<Category> categoryAddCommandService =
                new LoggingCommandServiceDecorator<Category>(
                        new CategoryAddManager(new HibernateCategoryDao()), new FileLogger());

        QueryService<Category> categoryListQueryService =
                new LoggingQueryServiceDecorator<Category>(
                        new CategoryListManager(new JdbcCategoryDao()), new DatabaseLogger());


        //INSTRUCTOR
        CommandService<Instructor> instructorAddCommandService =
                new LoggingCommandServiceDecorator<Instructor>(
                        new InstructorAddManager(new JdbcInstructorDao()), new FileLogger());

        QueryService<Instructor> instructorListQueryService =
                new LoggingQueryServiceDecorator<>(
                        new InstructorListManager(new HibernateInstructorDao()), new DatabaseLogger());

        System.out.println("******************************Category******************************");
        Category category1 = new Category();
        category1.setId(1);
        category1.setName("Programlama");
        category1.setCourses(InMemoryDatabase.courses);

        categoryAddCommandService.execute(category1);

        categoryListQueryService.execute();

        System.out.println("******************************Course******************************");


        Course course1 = new Course();
        course1.setId(1);
        course1.setName("Emre ile Java'ya doğru.");
        course1.setDescription("Java işte.");
        course1.setPrice(1);
        course1.setCategory(category1);

        Course course2 = new Course();
        course1.setId(2);
        course2.setName("Emre ile C#'a doğru.");
        course2.setDescription("Microsoft Certified Trainer (MCT) ,PMP ve ITIL sertifikalarına sahibim. Danışmanlık yaptığım kurumların bazıları : Merkez Bankası,TAI, Birleşmiş Milletler,NATO,İş Bankası, Akbank, Halkbank, Vakıfbank, Yapı Kredi Bankası, Ziraat Bankası, Emniyet, Başbakanlık, Cumhurbaşkanlığı, Hazine Müsteşarlığı, Maliye Bakanlığı, Tarım Bakanlığı, Tübitak.");
        course2.setPrice(300);

        courseAddCommandService.execute(course1);
        courseAddCommandService.execute(course2);

        courseListQueryService.execute();

        System.out.println("******************************Instructor******************************");
        List<Course> courseList = new ArrayList<Course>();
        courseList.add(course1);
        courseList.add(course2);
        Instructor instructor1 = new Instructor();
        instructor1.setId(1);
        instructor1.setFullName("Emre AKA");
        instructor1.setCourses(courseList);

        instructorAddCommandService.execute(instructor1);

        instructorListQueryService.execute();
    }
}