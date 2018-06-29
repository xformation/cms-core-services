package com.synectiks.cms.controller;

import com.synectiks.cms.model.Gpa;
import com.synectiks.cms.service.GpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api/gpa/"})
public class GpaController {

    @Autowired
    private GpaService gpaService;

    @PostMapping
    public Gpa create(@RequestBody Gpa gpa) {
        return gpaService.create(gpa);
    }

    @GetMapping(path = {"/{id}"})
    public Gpa findOne(@PathVariable("id") long id) {
        return gpaService.getGpaById(id);
    }

    @PutMapping
    public Gpa update(@RequestBody Gpa gpa) {
        return gpaService.saveGpa(gpa);
    }

    @DeleteMapping(path = {"/{id}"})
    public Gpa delete(@PathVariable("id") long id) {
        return gpaService.deleteGpa(id);
    }

    @GetMapping
    public Iterable<Gpa> findAll() {
        return gpaService.listAllGpa();
    }
}