package com.synectiks.cms.service;

import com.synectiks.cms.model.Dormitory;

public interface DormitoryService {

    Iterable<Dormitory> listAllDormitory();

    Dormitory getDormitoryById(Long id);

    Dormitory saveDormitory(Dormitory dormitory);

    Dormitory deleteDormitory(Long id);

    Dormitory create(Dormitory dormitory);

}
