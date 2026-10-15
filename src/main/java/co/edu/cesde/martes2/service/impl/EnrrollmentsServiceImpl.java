package co.edu.cesde.martes2.service.impl;

import co.edu.cesde.martes2.modules.EnroLlments;
import co.edu.cesde.martes2.repositories.EnrrolmentsRepository;
import co.edu.cesde.martes2.service.EnrrolmentsService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EnrrollmentsServiceImpl implements EnrrolmentsService {

    private final EnrrolmentsRepository enrrolmentsRepository;

    public EnrrollmentsServiceImpl (EnrrolmentsRepository enrrolmentsRepository){
        this.enrrolmentsRepository= enrrolmentsRepository;
    }

    @Override
    public EnroLlments save(EnroLlments enroLlments) {
        enrrolmentsRepository.save(enroLlments);

        return enroLlments;
    }

    @Override
    public List<EnroLlments> findAll() {
        return enrrolmentsRepository.findAll();
    }

    @Override
    public void deleteBystudentid(Long studentid) {
        enrrolmentsRepository.deleteBystudentid(studentid);

    }

    @Override
    public EnroLlments findBystudentid(Long studentid) {
        return enrrolmentsRepository.findBystudentid(studentid);
    }
}
