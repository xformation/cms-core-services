package com.synectiks.cms.service;

import com.synectiks.cms.model.Marks;

public interface MarksService {
    Iterable<Marks> listAllMarks();

    Marks getMarksById(Long id);

    Marks saveMarks(Marks marks);

    Marks deleteMarks(Long id);

    Marks create(Marks marks);


}
