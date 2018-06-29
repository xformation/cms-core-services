package com.synectiks.cms.service;

import com.synectiks.cms.exception.NotFoundException;
import com.synectiks.cms.model.DormitoryFee;
import com.synectiks.cms.repository.DormitoryFeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DormitoryFeeServiceImpl implements DormitoryFeeService {

    private DormitoryFeeRepository dormitoryFeeRepository;
    @Autowired
    public void setDormitoryFeeRepository(DormitoryFeeRepository dormitoryFeeRepository) {
        this.dormitoryFeeRepository = dormitoryFeeRepository;
    }

    @Override
    public Iterable<DormitoryFee> listAllDormitoryFee() {
        return dormitoryFeeRepository.findAll();
    }

    @Override
    public DormitoryFee getDormitoryFeeById(Long id) {
        return dormitoryFeeRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("DormitoryFee %d not found", id)));
    }

    @Override
    public DormitoryFee saveDormitoryFee(DormitoryFee dormitoryFee) {
        return dormitoryFeeRepository.save(dormitoryFee);
    }

    @Override
    public DormitoryFee deleteDormitoryFee(Long id) {
        DormitoryFee dormitoryFee = getDormitoryFeeById(id);
        if(dormitoryFee != null){
            dormitoryFeeRepository.delete(dormitoryFee);
        }
        return dormitoryFee;
    }

    @Override
    public DormitoryFee create(DormitoryFee dormitoryFee) {
        return dormitoryFeeRepository.save(dormitoryFee);
    }
}
