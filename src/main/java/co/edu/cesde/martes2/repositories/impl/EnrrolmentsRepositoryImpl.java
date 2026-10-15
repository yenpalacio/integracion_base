package co.edu.cesde.martes2.repositories.impl;

import co.edu.cesde.martes2.modules.EnroLlments;
import co.edu.cesde.martes2.repositories.EnrrolmentsRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EnrrolmentsRepositoryImpl implements EnrrolmentsRepository {

    private final List<EnroLlments> listenroLlments ;
    public EnrrolmentsRepositoryImpl(List <EnroLlments> enroLlments){
        this.listenroLlments= enroLlments;
    }

    @Override
    public void save(EnroLlments enroLlments) {
        listenroLlments.add(enroLlments);
    }

    @Override
    public EnroLlments findBystudentid(Long studentid) {
        for (EnroLlments enroLlments: listenroLlments){
            if (enroLlments.getStudentid().equals(studentid)){
                return enroLlments;
            }
        }
        return null;
    }

    @Override
    public void deleteBystudentid(Long studentid) {

        EnroLlments enroLlments =findBystudentid(studentid);
        if (enroLlments != null){
            listenroLlments.remove(enroLlments);
        }
    }

    @Override
    public List<EnroLlments> findAll() {
        return listenroLlments;
    }
}
