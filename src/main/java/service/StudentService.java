package service;

import Modules.Students;

import java.util.List;

public interface StudentService {
        void save (Students students);
        Students findById(Long id);
        void deleteById(Long id);
        List<Students> findAll();

}
