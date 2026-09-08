package repositories;

import Modules.EnroLlments;

import java.util.List;

public interface EnrrolmentsRepository {
    void save (EnroLlments enroLlments);
    EnroLlments findBystudentid(Long studentid);
    void deleteBystudentid(Long studentid);
    List<EnroLlments>findAll();
}
