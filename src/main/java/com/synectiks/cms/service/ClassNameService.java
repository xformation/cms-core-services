package com.synectiks.cms.service;

import com.synectiks.cms.model.ClassName;

public interface ClassNameService {

    Iterable<ClassName> listAllClassName();

    ClassName getClassNameById(Long id);

    ClassName saveClassName(ClassName className);

    ClassName deleteClassName(Long id);

    ClassName create(ClassName className);


}
