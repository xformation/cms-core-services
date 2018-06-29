package com.synectiks.cms.controller;
import com.synectiks.cms.model.Institute;
import com.synectiks.cms.service.InstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping({"/api/institute"})
public class InstituteController {
    @Autowired
    private InstituteService instituteService;

    @PostMapping
    public Institute create(@RequestBody Institute institute){
        return instituteService.create(institute);
    }

    @GetMapping(path = {"/{id}"})
    public Institute findOne(@PathVariable("id") long id){
        return instituteService.getInstituteById(id);
    }

    @PutMapping
    public Institute update(@RequestBody Institute institute){
        return instituteService.saveInstitute(institute);
    }

    @DeleteMapping(path ={"/{id}"})
    public Institute delete(@PathVariable("id") long id) {
        return instituteService.deleteInstitute(id);
    }

    @GetMapping
    public Iterable<Institute> findAll(){
        return instituteService.listAllInstitute();
    }
}
