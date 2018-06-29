package com.synectiks.cms.service;

import com.synectiks.cms.model.IssueBook;

public interface IssueBookService {
    Iterable<IssueBook> listAllIssueBook();

    IssueBook getIssueBookById(Long id);

    IssueBook saveIssueBook(IssueBook issuebook);

    IssueBook deleteIssueBook(Long id);

    IssueBook create(IssueBook issuebook);
}
