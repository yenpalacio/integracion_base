package co.edu.cesde.martes2.controller;

import co.edu.cesde.martes2.modules.EnroLlments;
import co.edu.cesde.martes2.service.EnrrolmentsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Enrrolments")
public class EnrrolmentsController {
    private final EnrrolmentsService enrrolmentsService;
    public EnrrolmentsController(EnrrolmentsService enrrolmentsService){
        this.enrrolmentsService=enrrolmentsService;
    }
    @PostMapping
    public EnroLlments create(@RequestBody EnroLlments enroLlments){
        return enrrolmentsService.save(enroLlments);
    }
    @GetMapping
    public List<EnroLlments> getAll(){
        return enrrolmentsService.findAll();
    }
}

