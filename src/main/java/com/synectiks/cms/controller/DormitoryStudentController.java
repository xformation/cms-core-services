package com.synectiks.cms.controller;

import com.synectiks.cms.model.DormitoryStudent;
import com.synectiks.cms.service.DormitoryStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api/dormitoryStudent"})
public class DormitoryStudentController {
    @Autowired
    private DormitoryStudentService dormitoryStudentService;

    @PostMapping
    public DormitoryStudent create(@RequestBody DormitoryStudent dormitoryStudent){
        return dormitoryStudentService.create(dormitoryStudent);
    }

    @GetMapping(path = {"/{id}"})
    public DormitoryStudent findOne(@PathVariable("id") long id){
        return dormitoryStudentService.getDormitoryStudentById(id);
    }

    @PutMapping
    public DormitoryStudent update(@RequestBody DormitoryStudent dormitoryStudent){
        return dormitoryStudentService.saveDormitoryStudent(dormitoryStudent);
    }

    @DeleteMapping(path ={"/{id}"})
    public DormitoryStudent delete(@PathVariable("id") long id) {
        return dormitoryStudentService.deleteDormitoryStudent(id);
    }

    @GetMapping
    public Iterable<DormitoryStudent> findAll(){
        return dormitoryStudentService.listAllDormitoryStudent();
    }
}
