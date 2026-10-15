package co.edu.cesde.martes2.repositories;

import co.edu.cesde.martes2.modules.Courses;

import java.util.List;

public interface CoursesRepository {
    void save(Courses courses);
    Courses findById(Long id);
    void deleteById(Long id);
    List<Courses>findAll();
}
