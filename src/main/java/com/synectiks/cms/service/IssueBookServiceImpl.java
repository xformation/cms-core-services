package com.synectiks.cms.service;
import com.synectiks.cms.exception.NotFoundException;
import com.synectiks.cms.model.IssueBook;
import com.synectiks.cms.repository.IssueBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IssueBookServiceImpl implements IssueBookService {
    private IssueBookRepository issuebookRepository;

    @Autowired
    public void setIssueBookRepository(IssueBookRepository issuebookRepository) {
        this.issuebookRepository = issuebookRepository;
    }

    @Override
    public Iterable<IssueBook> listAllIssueBook() {
        return issuebookRepository.findAll();
    }

    @Override
    public IssueBook getIssueBookById(Long id) {
        return issuebookRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("IssueBook %d not found", id)));
    }

    @Override
    public IssueBook saveIssueBook(IssueBook issuebook) {
        return issuebookRepository.save(issuebook);
    }

    @Override
    public IssueBook deleteIssueBook(Long id) {
        IssueBook issueBook = getIssueBookById(id);
        if(issueBook != null){
            issuebookRepository.delete(issueBook);
        }
        return issueBook;
    }

    @Override
    public IssueBook create(IssueBook issuebook) {
        return issuebookRepository.save(issuebook);
    }
}
