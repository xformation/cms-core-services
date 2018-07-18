package com.synectiks.cms.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;


@Entity
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
public class StdBill {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @OneToOne(mappedBy = "stdbill")
    private Student student;

    @Column
    private String billNo;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column
    private String lastName;
    @Column
    private String studentClass;



    @Column
    private String regiNo;
    @Column
    private String payableAmount;
    @Column
    private String paidAmount;
    @Column
    private String dueAmount;
    @Column
    private Date payDate;
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;


    public StdBill(){
    }

    public StdBill(String billNo, String lastName, String studentClass, String regiNo, String payableAmount, String paidAmount,
                   String dueAmount, Date payDate, Date createdAt, Date updatedAt)
    {
     this.billNo = billNo;
     this.lastName = lastName;
     this.studentClass = studentClass;
     this.regiNo = regiNo;
     this.payableAmount = payableAmount;
     this.paidAmount = paidAmount;
     this.dueAmount = dueAmount;
     this.payDate = payDate;
     this.createdAt = createdAt;
     this.updatedAt = updatedAt;
    }


    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getStudentClass() {
        return studentClass;
    }


    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getRegiNo() {
        return regiNo;
    }

    public void setRegiNo(String regiNo) {
        this.regiNo = regiNo;
    }

    public String getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(String payableAmount) {
        this.payableAmount = payableAmount;
    }

    public String getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(String dueAmount) {
        this.dueAmount = dueAmount;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }


}