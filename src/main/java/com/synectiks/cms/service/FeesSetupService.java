package com.synectiks.cms.service;

import com.synectiks.cms.model.FeesSetup;

public interface FeesSetupService {

    Iterable<FeesSetup> listAllFeesSetup();

    FeesSetup getFeesSetupById(Long id);

    FeesSetup saveFeesSetup(FeesSetup feesSetup);

    FeesSetup deleteFeesSetup(Long id);

    FeesSetup create(FeesSetup feesSetup);

}
