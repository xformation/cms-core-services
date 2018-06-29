package com.synectiks.cms.service;

import com.synectiks.cms.exception.NotFoundException;
import com.synectiks.cms.model.Dormitory;
import com.synectiks.cms.repository.DormitoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DormitoryServiceImpl implements DormitoryService {
    private DormitoryRepository dormitoryRepository;

    @Autowired
    public void setDormitoryRepository(DormitoryRepository dormitoryRepository){
        this.dormitoryRepository = dormitoryRepository;
    }

    @Override
    public Iterable<Dormitory> listAllDormitory() {
        return dormitoryRepository.findAll();
    }

    @Override
    public Dormitory getDormitoryById(Long id) {
        return  dormitoryRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Dormitory %d not found", id)));
    }

    @Override
    public Dormitory saveDormitory(Dormitory dormitory) {
        return null;
    }

    @Override
    public Dormitory deleteDormitory(Long id) {
            Dormitory dormitory = getDormitoryById(id);
            if(dormitory != null){
                dormitoryRepository.delete(dormitory);
            }
            return dormitory;
    }

    @Override
    public Dormitory create(Dormitory dormitory) {
        return dormitoryRepository.save(dormitory);
    }
}

