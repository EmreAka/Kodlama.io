package kodlama.io.dataAccess;

import kodlama.io.entities.Category;
import kodlama.io.entities.Course;
import kodlama.io.entities.Instructor;

import java.util.List;

public class InMemoryDatabase {
    static List<Course> courses;
    static List<Instructor> instructors;
    static List<Category> categories;
}
