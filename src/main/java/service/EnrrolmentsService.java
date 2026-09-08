package service;

import Modules.EnroLlments;

import java.util.List;

public interface EnrrolmentsService {
    void save (EnroLlments enroLlments);
    EnroLlments findBystudentid(Long studentid);
    void deleteBystudentid(Long studentid);
    List<EnroLlments> findAll();
}
