package service;

import Modules.Courses;

import java.util.List;

public interface CoursesService {
        void save(Courses courses);
        Courses findById(Long id);
        void deleteById(Long id);
        List<Courses> findAll();
}
