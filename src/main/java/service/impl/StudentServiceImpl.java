package service.impl;

import Modules.Students;
import repositories.StudentRepository;
import service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public  StudentServiceImpl (StudentRepository studentRepository){
        this.studentRepository =studentRepository;
    }

    @Override
    public void save(Students students) {
         studentRepository.save(students);
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
