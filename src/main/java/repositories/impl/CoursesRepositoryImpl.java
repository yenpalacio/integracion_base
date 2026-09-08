package repositories.impl;

import Modules.Courses;
import Modules.Students;
import repositories.CoursesRepository;

import java.util.List;

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