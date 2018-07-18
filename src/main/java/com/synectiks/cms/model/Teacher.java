package com.synectiks.cms.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "teacher")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
public class Teacher {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

  /*  @OneToMany(mappedBy = "teacher")
    private List<Student> student;*/

    @OneToMany(mappedBy = "teacher")
    private List<Attendance> attendance;

    @Column
    private String regNo;
    @Column
    private String fullName;
    @Column
    private String gender;
    @Column
    private String religion;
    @Column
    private String bloodgroup;
    @Column
    private String nationality;
    @Column
    private String dob;
    @Column
    private String joinDate;
    @Column
    private String photo;
    @Column
    private String educationQualification;
    @Column
    private String details;
    @Column
    private String cellNo;
    @Column
    private String presentAddress;
    private Integer isActive;
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;

    public Teacher(){

    }
    public Teacher(String regNo, String egroup, String fullName, String gender, String religion, String bloodgroup, String nationality,
                   String dob, String joinDate, String photo, String educationQualification, String details, String cellNo, String presentAddress,
                   Integer isActive, Date createdAt, Date updatedAt){
        this.regNo = regNo;
        this.fullName = fullName;
        this.gender = gender;
        this.religion = religion;
        this.bloodgroup = bloodgroup;
        this.nationality = nationality;
        this.dob = dob;
        this.joinDate = joinDate;
        this.photo = photo;
        this.educationQualification = educationQualification;
        this.details = details;
        this.cellNo = cellNo;
        this.presentAddress = presentAddress;
        this.isActive = isActive;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

   /* public Teacher(List<Student> student) {
        this.student = student;
    }
*/
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }



    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getEducationQualification() {
        return educationQualification;
    }

    public void setEducationQualification(String educationQualification) {
        this.educationQualification = educationQualification;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getCellNo() {
        return cellNo;
    }

    public void setCellNo(String cellNo) {
        this.cellNo = cellNo;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
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
