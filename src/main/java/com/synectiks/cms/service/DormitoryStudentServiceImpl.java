package com.synectiks.cms.service;

import com.synectiks.cms.exception.NotFoundException;
import com.synectiks.cms.model.DormitoryStudent;
import com.synectiks.cms.repository.DormitoryStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DormitoryStudentServiceImpl implements DormitoryStudentService {
    private DormitoryStudentRepository dormitoryStudentRepository;
    @Autowired
    public void setDormitoryStudentRepository(DormitoryStudentRepository dormitoryStudentRepository) {
        this.dormitoryStudentRepository = dormitoryStudentRepository;
    }
    @Override
    public Iterable<DormitoryStudent> listAllDormitoryStudent() {
        return dormitoryStudentRepository.findAll();
    }

    @Override
    public DormitoryStudent getDormitoryStudentById(Long id) {
        return dormitoryStudentRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("DormitoryStudent %d not found", id)));
    }

    @Override
    public DormitoryStudent saveDormitoryStudent(DormitoryStudent dormitoryStudent) {
        return dormitoryStudentRepository.save(dormitoryStudent);
    }

    @Override
    public DormitoryStudent deleteDormitoryStudent(Long id) {
        DormitoryStudent dormitoryStudent = getDormitoryStudentById(id);
        if(dormitoryStudent != null){
            dormitoryStudentRepository.delete(dormitoryStudent);
        }
        return dormitoryStudent;
    }

    @Override
    public DormitoryStudent create(DormitoryStudent dormitoryStudent) {
        return dormitoryStudentRepository.save(dormitoryStudent);
    }
}
