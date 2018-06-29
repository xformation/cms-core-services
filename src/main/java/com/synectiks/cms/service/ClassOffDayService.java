package com.synectiks.cms.service;

import com.synectiks.cms.model.ClassOffDay;

public interface ClassOffDayService {
    Iterable<ClassOffDay> listAllClassOffDay();

    ClassOffDay getClassOffDayById(Long id);

    ClassOffDay saveClassOffDay(ClassOffDay classOffDay);

    ClassOffDay deleteClassOffDay(Long id);

    ClassOffDay create(ClassOffDay classOffDay);


}
