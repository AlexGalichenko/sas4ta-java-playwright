package org.sas4ta.models;

public class DoctorData {
    private String name;
    private Gender gender;
    private String mobile;
    private String email;
    private String department;
    private String eduction;
    private String experience;
    private String designation;
    private String dutyTiming;

    public String getName() {
        return name;
    }

    public DoctorData setName(String name) {
        this.name = name;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public DoctorData setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public String getMobile() {
        return mobile;
    }

    public DoctorData setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public DoctorData setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public DoctorData setDepartment(String department) {
        this.department = department;
        return this;
    }

    public String getEduction() {
        return eduction;
    }

    public DoctorData setEduction(String eduction) {
        this.eduction = eduction;
        return this;
    }

    public String getExperience() {
        return experience;
    }

    public DoctorData setExperience(String experience) {
        this.experience = experience;
        return this;
    }

    public String getDesignation() {
        return designation;
    }

    public DoctorData setDesignation(String designation) {
        this.designation = designation;
        return this;
    }

    public String getDutyTiming() {
        return dutyTiming;
    }

    public DoctorData setDutyTiming(String dutyTiming) {
        this.dutyTiming = dutyTiming;
        return this;
    }
}
