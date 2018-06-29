package com.synectiks.cms.service;

import com.synectiks.cms.exception.NotFoundException;
import com.synectiks.cms.model.Gpa;
import com.synectiks.cms.repository.GpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GpaServiceImpl implements GpaService {
    private GpaRepository gpaRepository;

    @Autowired
    public void setGpaRepository(GpaRepository gpaRepository) {
        this.gpaRepository = gpaRepository;
    }

    @Override
    public Iterable<Gpa> listAllGpa() {
        return gpaRepository.findAll();
    }

    @Override
    public Gpa getGpaById(Long id) {
        return gpaRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Gpa %d not found", id)));
    }

    @Override
    public Gpa saveGpa(Gpa gpa) {
        return gpaRepository.save(gpa);
    }

    @Override
    public Gpa deleteGpa(Long id) {
        Gpa gpa = getGpaById(id);
        if (gpa != null) {
            gpaRepository.delete(gpa);
        }
        return gpa;
    }

    @Override
    public Gpa create(Gpa gpa) {
        return gpaRepository.save(gpa);
    }
}
