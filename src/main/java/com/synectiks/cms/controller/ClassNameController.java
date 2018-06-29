package com.synectiks.cms.controller;

import com.synectiks.cms.model.ClassName;
import com.synectiks.cms.service.ClassNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api/className/"})
public class ClassNameController {

    @Autowired
    private ClassNameService classNameService;

    @PostMapping
    public ClassName create(@RequestBody ClassName className){
        return classNameService.create(className);
    }

    @GetMapping(path = {"/{id}"})
    public ClassName findOne(@PathVariable("id") long id){
        return classNameService.getClassNameById(id);
    }

    @PutMapping
    public ClassName update(@RequestBody ClassName className){
        return classNameService.saveClassName(className);
    }

    @DeleteMapping(path ={"/{id}"})
    public ClassName delete(@PathVariable("id") long id) {
        return classNameService.deleteClassName(id);
    }

    @GetMapping
    public Iterable<ClassName> findAll(){
        return classNameService.listAllClassName();
    }

}
