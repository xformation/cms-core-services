package com.synectiks.cms.service;

import com.synectiks.cms.exception.NotFoundException;
import com.synectiks.cms.model.ClassName;
import com.synectiks.cms.repository.ClassNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassNameServiceImpl implements ClassNameService {
    private ClassNameRepository classNameRepository;

    @Autowired
    public void setClassNameRepository(ClassNameRepository classNameRepository) {
        this.classNameRepository = classNameRepository;
    }

    @Override
    public Iterable<ClassName> listAllClassName() {
        return classNameRepository.findAll();
    }

    @Override
    public ClassName getClassNameById(Long id) {
        return classNameRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("ClassName %d not found", id)));
    }

    @Override
    public ClassName saveClassName(ClassName className) {
        return classNameRepository.save(className);
    }

    @Override
    public ClassName deleteClassName(Long id) {
        ClassName className = getClassNameById(id);
        if(className != null){
            classNameRepository.delete(className);
        }
        return className;
    };


    @Override
    public ClassName create(ClassName className) {
        return classNameRepository.save(className);
    }


}
