package com.synectiks.cms.controller;


import com.synectiks.cms.model.Dormitory;
import com.synectiks.cms.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api/dormitory/"})
public class DormitoryController {

    @Autowired
    private DormitoryService dormitoryService;

    @PostMapping
    public Dormitory create(@RequestBody Dormitory dormitory){
        return dormitoryService.create(dormitory);
    }

    @GetMapping(path = {"/{id}"})
    public Dormitory findOne(@PathVariable("id") long id){
        return dormitoryService.getDormitoryById(id);
    }

    @PutMapping
    public Dormitory update(@RequestBody Dormitory dormitory){
        return dormitoryService.saveDormitory(dormitory);
    }

    @DeleteMapping(path ={"/{id}"})
    public Dormitory delete(@PathVariable("id") long id) {
        return dormitoryService.deleteDormitory(id);
    }

    @GetMapping
    public Iterable<Dormitory> findAll(){
        return dormitoryService.listAllDormitory();
    }
}

