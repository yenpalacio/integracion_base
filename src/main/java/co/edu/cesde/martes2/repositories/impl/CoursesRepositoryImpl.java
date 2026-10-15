package co.edu.cesde.martes2.repositories.impl;

import co.edu.cesde.martes2.modules.Courses;
import co.edu.cesde.martes2.repositories.CoursesRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CoursesRepositoryImpl implements CoursesRepository {
    private final List<Courses> listcourses;

    public CoursesRepositoryImpl(List<Courses> courses) {
        this.listcourses = courses;
    }

    @Override
    public void save(Courses courses) {
        listcourses.add(courses);

    }

    @Override
    public Courses findById(Long id) {
       for (Courses courses:listcourses){
           if (courses.getId().equals(id)){
               return courses;
           }
       }
       return null;

    }

    @Override
    public void deleteById(Long id) {
Courses courses= findById(id);
if (courses != null){
    listcourses.remove(courses);
}
    }

    @Override
    public List<Courses> findAll() {
        return listcourses;
    }
}