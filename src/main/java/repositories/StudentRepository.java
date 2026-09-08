package repositories;

import Modules.Students;

import java.util.List;

// la interfas es lo que se va a hacer sin decir como lo va a hacer
public interface StudentRepository {
    void save (Students students);
    Students findById(Long id);
    void deleteById(Long id);
    List<Students>findAll();



}
