package repositories;

import Modules.Courses;

import java.util.List;

public interface CoursesRepository {
    void save(Courses courses);
    Courses findById(Long id);
    void deleteById(Long id);
    List<Courses>findAll();
}
