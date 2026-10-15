package co.edu.cesde.martes2.service;

import co.edu.cesde.martes2.modules.Students;

import java.util.List;

public interface StudentService {
        Students save (Students students);
        Students findById(Long id);
        void deleteById(Long id);
        List<Students> findAll();

}
