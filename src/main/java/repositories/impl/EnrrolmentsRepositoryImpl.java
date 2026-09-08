package repositories.impl;

import Modules.EnroLlments;
import repositories.EnrrolmentsRepository;

import java.util.List;

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
