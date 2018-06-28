package com.synectiks.cms.service;

import com.synectiks.cms.model.Institute;

public interface InstituteService {
    Iterable<Institute> listAllInstitute();

    Institute getInstituteById(Long id);

    Institute saveInstitute(Institute institute);

    Institute deleteInstitute(Long id);

    Institute create(Institute institute);
}
