package com.synectiks.cms.controller;

import com.synectiks.cms.model.ClassOffDay;
import com.synectiks.cms.service.ClassOffDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api/classOffDay"})
public class ClassOffDayController {
    @Autowired
    private ClassOffDayService classOffDayService;

    @PostMapping
    public ClassOffDay create(@RequestBody ClassOffDay classOffDay){
        return classOffDayService.create(classOffDay);
    }

    @GetMapping(path = {"/{id}"})
    public ClassOffDay findOne(@PathVariable("id") long id){
        return classOffDayService.getClassOffDayById(id);
    }

    @PutMapping
    public ClassOffDay update(@RequestBody ClassOffDay classOffDay){
        return classOffDayService.saveClassOffDay(classOffDay);
    }

    @DeleteMapping(path ={"/{id}"})
    public ClassOffDay delete(@PathVariable("id") long id) {
        return classOffDayService.deleteClassOffDay(id);
    }

    @GetMapping
    public Iterable<ClassOffDay> findAll(){
        return classOffDayService.listAllClassOffDay();
    }

}
