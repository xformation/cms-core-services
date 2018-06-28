package com.synectiks.cms.service;

import com.synectiks.cms.exception.NotFoundException;
import com.synectiks.cms.model.Institute;
import com.synectiks.cms.repository.InstituteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstituteServiceImpl implements InstituteService {
    private InstituteRepository instituteRepository;

    @Autowired
    public void setInstituteRepository(InstituteRepository instituteRepository) {
        this.instituteRepository = instituteRepository;
    }

    @Override
    public Iterable<Institute> listAllInstitute() {
        return instituteRepository.findAll();
    }

    @Override
    public Institute getInstituteById(Long id) {
        return instituteRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Institute %d not found", id)));
    }

    @Override
    public Institute saveInstitute(Institute institute) {
        return instituteRepository.save(institute);
    }

    @Override
    public Institute deleteInstitute(Long id) {
        Institute institute = getInstituteById(id);
        if(institute != null){
            instituteRepository.delete(institute);
        }
        return institute;
    }

    @Override
    public Institute create(Institute institute) {
        return instituteRepository.save(institute);
    }
}
