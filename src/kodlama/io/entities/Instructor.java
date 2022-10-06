package kodlama.io.entities;

import java.util.List;

public class Instructor {
    private String instructor;
    private List<Course> courses;

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public List<Course> getLessons() {
        return courses;
    }

    public void setLessons(List<Course> courses) {
        this.courses = courses;
    }
}
