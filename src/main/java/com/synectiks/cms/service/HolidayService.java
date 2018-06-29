package com.synectiks.cms.service;

import com.synectiks.cms.model.Holiday;

public interface HolidayService {
    Iterable<Holiday> listAllHoliday();

    Holiday getHolidayById(Long id);

    Holiday saveHoliday(Holiday holiday);

    Holiday deleteHoliday(Long id);

    Holiday create(Holiday holiday);
}
