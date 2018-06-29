package com.synectiks.cms.service;

import com.synectiks.cms.exception.NotFoundException;
import com.synectiks.cms.model.FeesSetup;
import com.synectiks.cms.repository.FeesSetupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeesSetupServiceImpl implements FeesSetupService {
    private FeesSetupRepository feesSetupRepository;

    @Autowired
    public void setFeesSetupRepository(FeesSetupRepository feesSetupRepository) {
        this.feesSetupRepository = feesSetupRepository;
    }
    @Override
    public Iterable<FeesSetup> listAllFeesSetup() {
        return feesSetupRepository.findAll();
    }

    @Override
    public FeesSetup getFeesSetupById(Long id) {
        return  feesSetupRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("FeesSetup %d not found", id)));
    };


    @Override
    public FeesSetup saveFeesSetup(FeesSetup feesSetup) {
        return feesSetupRepository.save(feesSetup);
    }

    @Override
    public FeesSetup deleteFeesSetup(Long id) {
        FeesSetup feesSetup = getFeesSetupById(id);
        if(feesSetup != null){
            feesSetupRepository.delete(feesSetup);
        }
        return feesSetup;

    }

    @Override
    public FeesSetup create(FeesSetup feesSetup) {
        return feesSetupRepository.save(feesSetup);
    }
}

