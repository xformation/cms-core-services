package com.synectiks.cms.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "dormitoryFee")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
public class DormitoryFee {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @Column
    private int  regiNo;
    @Column
    private  float  feeMonth;
    @Column
    private float   feeAmount;
    @CreatedDate
    private Date createdAt;

    private Date updatedAt;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getRegiNo() {
        return regiNo;
    }

    public void setRegiNo(int regiNo) {
        this.regiNo = regiNo;
    }

    public float getFeeMonth() {
        return feeMonth;
    }

    public void setFeeMonth(float feeMonth) {
        this.feeMonth = feeMonth;
    }

    public float getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(float feeAmount) {
        this.feeAmount = feeAmount;
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
