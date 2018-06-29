package com.synectiks.cms.service;

import com.synectiks.cms.model.DormitoryStudent;

public interface DormitoryStudentService {

    Iterable<DormitoryStudent> listAllDormitoryStudent();

    DormitoryStudent getDormitoryStudentById(Long id);

    DormitoryStudent saveDormitoryStudent(DormitoryStudent dormitoryStudent);

    DormitoryStudent deleteDormitoryStudent(Long id);

    DormitoryStudent create(DormitoryStudent dormitoryStudent);


}
