package com.synectiks.cms.service;

import com.synectiks.cms.model.DormitoryFee;

public interface DormitoryFeeService {
    Iterable<DormitoryFee> listAllDormitoryFee();

    DormitoryFee getDormitoryFeeById(Long id);

    DormitoryFee saveDormitoryFee(DormitoryFee dormitoryFee);

    DormitoryFee deleteDormitoryFee(Long id);

    DormitoryFee create(DormitoryFee dormitoryFee);


}
