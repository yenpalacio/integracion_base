package co.edu.cesde.martes2.service.impl;

import co.edu.cesde.martes2.modules.Courses;
import co.edu.cesde.martes2.repositories.CoursesRepository;
import co.edu.cesde.martes2.service.CoursesService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CoursesServiceImpl implements CoursesService {

    private final CoursesRepository coursesRepository;

    public  CoursesServiceImpl (CoursesRepository coursesRepository){
        this.coursesRepository =coursesRepository;
    }

    @Override
    public Courses save(Courses courses) {
        coursesRepository.save(courses);
        return courses;
    }

    @Override
    public Courses findById(Long id) {
        return coursesRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        coursesRepository.deleteById(id);

    }

    @Override
    public List<Courses> findAll() {
        return coursesRepository.findAll();
    }
}

