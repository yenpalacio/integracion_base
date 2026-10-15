package co.edu.cesde.martes2.controller;

import co.edu.cesde.martes2.modules.Students;
import co.edu.cesde.martes2.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }
    @PostMapping
    public Students create(@RequestBody Students student){
        return studentService.save(student);
    }
@GetMapping
    public List<Students> getAll(){
        return studentService.findAll();
}
}
