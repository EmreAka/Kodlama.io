package kodlama.io.dataAccess;

import kodlama.io.entities.Category;
import kodlama.io.entities.Course;
import kodlama.io.entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDatabase {
    public static List<Course> courses = new ArrayList<Course>();
    public static List<Instructor> instructors = new ArrayList<Instructor>();
    public static List<Category> categories = new ArrayList<Category>();
}
