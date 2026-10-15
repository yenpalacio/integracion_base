package co.edu.cesde.martes2.service;

import co.edu.cesde.martes2.modules.Courses;

import java.util.List;

public interface CoursesService {
        Courses save(Courses courses);
        Courses findById(Long id);
        void deleteById(Long id);
        List<Courses> findAll();
}
