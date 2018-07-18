package com.synectiks.cms.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.util.Date;


@Entity
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
public class Student {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    @JoinColumn(name = "attendance_id")
    @RestResource(path = "studentd")
    private Attendance attendance;


    @OneToOne
    @JoinColumn(name = "stdbill_id")
    @RestResource(path = "studentstdbill")
    private StdBill stdbill;

   /* @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;*/

    @ManyToOne
    @JoinColumn(name = "studentclass_id")
    private StudentClass studentClass;



    @Column
    private String regiNo;
    @Column
    private String rollNo;

    @Column
    private String group;
    @Column
    private String section;
    @Column
    private String firstName;
    @Column
    private String middleName;
    @Column
    private String lastName;
    @Column
    private String gender;
    @Column
    private String religion;
    @Column
    private String bloodgroup;
    @Column
    private String nationality;
    @Column
    private Date dob;
    @Column
    private String photo;
    @Column
    private String extraActivity;
    @Column
    private String remarks;
    @Column
    private String fatherName;
    @Column
    private String fatherCellNo;
    @Column
    private String motherName;
    @Column
    private String motherCellNo;
    @Column
    private String localGuardian;
    @Column
    private String localGuardianCell;
    @Column
    private String presentAddress;
    @Column
    private String permanentAddress;
    @Column
    private String isActive;
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;

    public Student()
    {

    }

    public Student(Attendance attendance, StdBill stdbill, StudentClass studentclass, Teacher teacher, String regiNo, String rollNo, String group, String section, String firstName, String middleName, String lastName, String gender, String religion, String bloodgroup, String nationality, Date dob, String photo, String extraActivity, String remarks, String fatherName, String fatherCellNo, String motherName, String motherCellNo, String localGuardian, String localGuardianCell, String presentAddress, String permanentAddress, String isActive, Date createdAt, Date updatedAt) {
        this.attendance = attendance;
        this.stdbill = stdbill;
        //this.teacher = teacher;
        this.regiNo = regiNo;
        this.rollNo = rollNo;
        this.group = group;
        this.section = section;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.religion = religion;
        this.bloodgroup = bloodgroup;
        this.nationality = nationality;
        this.dob = dob;
        this.photo = photo;
        this.extraActivity = extraActivity;
        this.remarks = remarks;
        this.fatherName = fatherName;
        this.fatherCellNo = fatherCellNo;
        this.motherName = motherName;
        this.motherCellNo = motherCellNo;
        this.localGuardian = localGuardian;
        this.localGuardianCell = localGuardianCell;
        this.presentAddress = presentAddress;
        this.permanentAddress = permanentAddress;
        this.isActive = isActive;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Attendance getAttendance() {
        return attendance;
    }

    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }

    public StdBill getStdbill() {
        return stdbill;
    }

    public void setStdbill(StdBill stdbill) {
        this.stdbill = stdbill;
    }



    /*public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }*/

    public String getRegiNo() {
        return regiNo;
    }

    public void setRegiNo(String regiNo) {
        this.regiNo = regiNo;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getExtraActivity() {
        return extraActivity;
    }

    public void setExtraActivity(String extraActivity) {
        this.extraActivity = extraActivity;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherCellNo() {
        return fatherCellNo;
    }

    public void setFatherCellNo(String fatherCellNo) {
        this.fatherCellNo = fatherCellNo;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMotherCellNo() {
        return motherCellNo;
    }

    public void setMotherCellNo(String motherCellNo) {
        this.motherCellNo = motherCellNo;
    }

    public String getLocalGuardian() {
        return localGuardian;
    }

    public void setLocalGuardian(String localGuardian) {
        this.localGuardian = localGuardian;
    }

    public String getLocalGuardianCell() {
        return localGuardianCell;
    }

    public void setLocalGuardianCell(String localGuardianCell) {
        this.localGuardianCell = localGuardianCell;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
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
