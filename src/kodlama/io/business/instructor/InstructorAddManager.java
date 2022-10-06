package kodlama.io.business.instructor;

import kodlama.io.business.CommandService;
import kodlama.io.dataAccess.InstructorDao;
import kodlama.io.entities.Instructor;

public class InstructorAddManager implements CommandService<Instructor> {

    private final InstructorDao instructorDao;

    public InstructorAddManager(InstructorDao instructorDao) {
        this.instructorDao = instructorDao;
    }

    @Override
    public void execute(Instructor instructor) throws Exception {
        this.instructorDao.add(instructor);
    }
}
