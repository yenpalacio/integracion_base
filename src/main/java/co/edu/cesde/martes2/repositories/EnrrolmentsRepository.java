package co.edu.cesde.martes2.repositories;

import co.edu.cesde.martes2.modules.EnroLlments;
import org.aspectj.apache.bcel.Repository;

import java.util.List;

public interface EnrrolmentsRepository  {
    void save (EnroLlments enroLlments);
    EnroLlments findBystudentid(Long studentid);
    void deleteBystudentid(Long studentid);
    List<EnroLlments>findAll();
}
