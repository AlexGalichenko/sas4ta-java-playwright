package org.sas4ta.models;

public enum Gender {
    MALE ("male"),
    FEMALE ("female");

    private final String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
