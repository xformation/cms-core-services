package com.synectiks.cms.controller;


import com.synectiks.cms.model.DormitoryFee;
import com.synectiks.cms.service.DormitoryFeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api/dormitoryFee"})
public class DormitoryFeeController {
    @Autowired
    private DormitoryFeeService dormitoryFeeService;

    @PostMapping
    public DormitoryFee create(@RequestBody DormitoryFee dormitoryFee){
        return dormitoryFeeService.create(dormitoryFee);
    }

    @GetMapping(path = {"/{id}"})
    public DormitoryFee findOne(@PathVariable("id") long id){
        return dormitoryFeeService.getDormitoryFeeById(id);
    }

    @PutMapping
    public DormitoryFee update(@RequestBody DormitoryFee dormitoryFee){
        return dormitoryFeeService.saveDormitoryFee(dormitoryFee);
    }

    @DeleteMapping(path ={"/{id}"})
    public DormitoryFee delete(@PathVariable("id") long id) {
        return dormitoryFeeService.deleteDormitoryFee(id);
    }

    @GetMapping
    public Iterable<DormitoryFee> findAll(){
        return dormitoryFeeService.listAllDormitoryFee();
    }


}
