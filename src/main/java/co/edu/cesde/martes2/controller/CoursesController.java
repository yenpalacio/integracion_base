package co.edu.cesde.martes2.controller;

import co.edu.cesde.martes2.modules.Courses;
import co.edu.cesde.martes2.service.CoursesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Courses")
public class CoursesController {
    private final CoursesService coursesService;
    public CoursesController(CoursesService coursesService){
        this.coursesService= coursesService;
    }
    @PostMapping
    public Courses create(@RequestBody Courses courses){
        return coursesService.save(courses);
    }
    @GetMapping
    public List<Courses> getAll(){
        return coursesService.findAll();
    }
}

