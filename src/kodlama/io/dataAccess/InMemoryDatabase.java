package kodlama.io.dataAccess;

import kodlama.io.entities.Category;
import kodlama.io.entities.Course;
import kodlama.io.entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDatabase {
    static List<Course> courses = new ArrayList<Course>();
    static List<Instructor> instructors = new ArrayList<Instructor>();
    static List<Category> categories = new ArrayList<Category>();
}
