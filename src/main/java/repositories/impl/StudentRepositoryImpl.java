package repositories.impl;
// implementar es como hacer las cosas
import Modules.Students;
import repositories.StudentRepository;

import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {

    private final List<Students> liststudents ;
    public StudentRepositoryImpl(List <Students> students){
        this.liststudents= students;
    }

    @Override
    public void save(Students students) {
        liststudents.add(students);
    }


    @Override
    public Students findById(Long id) {
        for(Students students: liststudents){
            if(students.getId().equals(id)){
                return students;
            }

        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        Students student = findById(id);
        if (student != null) {
            liststudents.remove(student);
        }
    }

    @Override
    public List<Students> findAll() {
        return liststudents;
    }
}
