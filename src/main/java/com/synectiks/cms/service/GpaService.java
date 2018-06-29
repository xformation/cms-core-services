package com.synectiks.cms.service;

import com.synectiks.cms.model.Gpa;

public interface GpaService {

    Iterable<Gpa> listAllGpa();

    Gpa getGpaById(Long id);

    Gpa saveGpa(Gpa gpa);

    Gpa deleteGpa(Long id);

    Gpa create(Gpa gpa);
}