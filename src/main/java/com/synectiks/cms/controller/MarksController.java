package com.synectiks.cms.controller;

import com.synectiks.cms.model.Marks;
import com.synectiks.cms.service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api/marks"})
public class MarksController {
    @Autowired
    private MarksService marksService;

    @PostMapping
    public Marks create(@RequestBody Marks marks){
        return marksService.create(marks);
    }

    @GetMapping(path = {"/{id}"})
    public Marks findOne(@PathVariable("id") long id){
        return marksService.getMarksById(id);
    }

    @PutMapping
    public Marks update(@RequestBody Marks marks){
        return marksService.saveMarks(marks);
    }

    @DeleteMapping(path ={"/{id}"})
    public Marks delete(@PathVariable("id") long id) {
        return marksService.deleteMarks(id);
    }

    @GetMapping
    public Iterable<Marks> findAll(){
        return marksService.listAllMarks();
    }


}
