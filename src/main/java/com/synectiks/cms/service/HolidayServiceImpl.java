package com.synectiks.cms.service;

import com.synectiks.cms.exception.NotFoundException;
import com.synectiks.cms.model.Holiday;
import com.synectiks.cms.repository.HolidayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HolidayServiceImpl implements HolidayService {
    private HolidayRepository holidayRepository;

    @Autowired
    public void setHolidayRepository(HolidayRepository holidayRepository) {
        this.holidayRepository = holidayRepository;
    }

    @Override
    public Iterable<Holiday> listAllHoliday() {
        return holidayRepository.findAll();
    }

    @Override
    public Holiday getHolidayById(Long id) {
        return holidayRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Holiday %d not found", id)));
    }

    @Override
    public Holiday saveHoliday(Holiday holiday) {
        return holidayRepository.save(holiday);
    }

    @Override
    public Holiday deleteHoliday(Long id) {
        Holiday holiday = getHolidayById(id);
        if (holiday != null) {
            holidayRepository.delete(holiday);
        }
        return holiday;
    }

    @Override
    public Holiday create(Holiday holiday) {
        return holidayRepository.save(holiday);
    }
}
