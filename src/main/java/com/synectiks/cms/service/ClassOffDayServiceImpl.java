package com.synectiks.cms.service;

import com.synectiks.cms.exception.NotFoundException;
import com.synectiks.cms.model.ClassOffDay;
import com.synectiks.cms.repository.ClassOffDayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClassOffDayServiceImpl implements ClassOffDayService {
    private ClassOffDayRepository classOffDayRepository;

    @Autowired
    public void setClassOffDayRepository(ClassOffDayRepository classOffDayRepository) {
        this.classOffDayRepository = classOffDayRepository;
    }

    @Override
    public Iterable<ClassOffDay> listAllClassOffDay() {
        return classOffDayRepository.findAll();
    }

    @Override
    public ClassOffDay getClassOffDayById(Long id) {
        return classOffDayRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("ClassOffDay %d not found", id)));
    }

    @Override
    public ClassOffDay saveClassOffDay(ClassOffDay classOffDay) {
        return classOffDayRepository.save(classOffDay);
    }

    @Override
    public ClassOffDay deleteClassOffDay(Long id) {
        ClassOffDay classOffDay = getClassOffDayById(id);
        if(classOffDay != null){
            classOffDayRepository.delete(classOffDay);
        }
        return classOffDay;
    }

    @Override
    public ClassOffDay create(ClassOffDay classOffDay) {
        return classOffDayRepository.save(classOffDay);
    }
}
