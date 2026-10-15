package co.edu.cesde.martes2.service;

import co.edu.cesde.martes2.modules.EnroLlments;

import java.util.List;

public interface EnrrolmentsService {
    EnroLlments save (EnroLlments enroLlments);
    EnroLlments findBystudentid(Long studentid);
    void deleteBystudentid(Long studentid);
    List<EnroLlments> findAll();
}
