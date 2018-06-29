package com.synectiks.cms.service;

import com.synectiks.cms.exception.NotFoundException;
import com.synectiks.cms.model.Marks;
import com.synectiks.cms.repository.MarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarksServiceImpl implements MarksService {


    private MarksRepository marksRepository;
    @Autowired
    public void setMarksRepository(MarksRepository marksRepository) {
        this.marksRepository = marksRepository;
    }

    @Override
    public Iterable<Marks> listAllMarks() {
        return marksRepository.findAll();
    }

    @Override
    public Marks getMarksById(Long id) {
        return marksRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Marks %d not found", id)));
    }

    @Override
    public Marks saveMarks(Marks marks) {
        return marksRepository.save(marks);
    }

    @Override
    public Marks deleteMarks(Long id) {
        Marks marks = getMarksById(id);
        if(marks != null){
            marksRepository.delete(marks);
        }
        return marks;
    }

    @Override
    public Marks create(Marks marks) {
        return marksRepository.save(marks);
    }
}
