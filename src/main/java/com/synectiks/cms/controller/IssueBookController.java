package com.synectiks.cms.controller;

import com.synectiks.cms.model.IssueBook;
import com.synectiks.cms.service.IssueBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api/issueBook"})
public class IssueBookController {
    @Autowired
    private IssueBookService issuebookService;


    @PostMapping
    public IssueBook create(@RequestBody IssueBook issuebook) {
        return issuebookService.create(issuebook);
    }

    @GetMapping(path = {"/{id}"})
    public IssueBook findOne(@PathVariable("id") long id) {
        return issuebookService.getIssueBookById(id);
    }

    @PutMapping
    public IssueBook update(@RequestBody IssueBook issuebook) {
        return issuebookService.saveIssueBook(issuebook);
    }

    @DeleteMapping(path = {"/{id}"})
    public IssueBook delete(@PathVariable("id") long id) {
        return issuebookService.deleteIssueBook(id);
    }

    @GetMapping
    public Iterable<IssueBook> findAll() {
        return issuebookService.listAllIssueBook();
    }

}
