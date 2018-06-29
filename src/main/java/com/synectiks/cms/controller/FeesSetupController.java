package com.synectiks.cms.controller;

import com.synectiks.cms.model.FeesSetup;
import com.synectiks.cms.service.FeesSetupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api/feesSetup/"})
public class FeesSetupController {

    @Autowired
    private FeesSetupService feesSetupService;

    @PostMapping
    public FeesSetup create(@RequestBody FeesSetup feessetup){
        return feesSetupService.create(feessetup);
    }

    @GetMapping(path = {"/{id}"})
    public FeesSetup findOne(@PathVariable("id") long id){
        return feesSetupService.getFeesSetupById(id);
    }


    @PutMapping
    public FeesSetup update(@RequestBody FeesSetup feesSetup){
        return feesSetupService.saveFeesSetup(feesSetup);
    }

    @DeleteMapping(path ={"/{id}"})
    public FeesSetup delete(@PathVariable("id") long id) {
        return feesSetupService.deleteFeesSetup(id);
    }

    @GetMapping
    public Iterable<FeesSetup> findAll(){
        return feesSetupService.listAllFeesSetup();
    }
}

