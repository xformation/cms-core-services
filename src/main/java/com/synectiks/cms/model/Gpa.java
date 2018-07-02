package com.synectiks.cms.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Gpa")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
public class Gpa {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private long forStudent;
    @Column
    private String gpa;
    @Column
    private float grade;
    @Column
    private int markFrom;
    @Column
    private int markTo;
    @CreatedDate
    private Date created_at;
    @LastModifiedDate
    private Date updated_at;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getForStudent() {
        return forStudent;
    }

    public void setForStudent(long forStudent) {
        this.forStudent = forStudent;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public int getMarkFrom() {
        return markFrom;
    }

    public void setMarkFrom(int markFrom) {
        this.markFrom = markFrom;
    }

    public int getMarkTo() {
        return markTo;
    }

    public void setMarkTo(int markTo) {
        this.markTo = markTo;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}