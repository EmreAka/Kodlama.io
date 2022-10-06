package kodlama.io.business.instructor;

import kodlama.io.business.QueryService;
import kodlama.io.dataAccess.InstructorDao;
import kodlama.io.entities.Category;
import kodlama.io.entities.Instructor;

public class InstructorListManager implements QueryService<Instructor> {

    private final InstructorDao instructorDao;

    public InstructorListManager(InstructorDao instructorDao) {
        this.instructorDao = instructorDao;
    }

    @Override
    public void execute() {
        var result = this.instructorDao.getAll();
        for(Instructor instructor: result){
            System.out.println("Instructor name: "+ instructor.getFullName());
            System.out.println("***************************");
        }
    }
}
