package co.edu.cesde.martes2.service.impl;

import co.edu.cesde.martes2.modules.Students;
import co.edu.cesde.martes2.repositories.StudentRepository;
import co.edu.cesde.martes2.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public  StudentServiceImpl (StudentRepository studentRepository){
        this.studentRepository =studentRepository;
    }

    @Override
    public Students save(Students students) {
         studentRepository.save(students);
        return students;
    }

    @Override
    public Students findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
         studentRepository.deleteById(id);

    }

    @Override
    public List<Students> findAll() {
        return studentRepository.findAll();
    }
}
