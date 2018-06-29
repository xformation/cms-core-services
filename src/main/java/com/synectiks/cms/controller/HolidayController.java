package com.synectiks.cms.controller;

import com.synectiks.cms.model.Holiday;
import com.synectiks.cms.service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api/holiday/"})

public class HolidayController {
    @Autowired
    private HolidayService holidayService;


    @PostMapping
    public Holiday create(@RequestBody Holiday holiday) {
        return holidayService.create(holiday);
    }

    @GetMapping(path = {"/{id}"})
    public Holiday findOne(@PathVariable("id") long id) {
        return holidayService.getHolidayById(id);
    }

    @PutMapping
    public Holiday update(@RequestBody Holiday holiday) {
        return holidayService.saveHoliday(holiday);
    }

    @DeleteMapping(path = {"/{id}"})
    public Holiday delete(@PathVariable("id") long id) {
        return holidayService.deleteHoliday(id);
    }

    @GetMapping
    public Iterable<Holiday> findAll() {
        return holidayService.listAllHoliday();
    }

}
