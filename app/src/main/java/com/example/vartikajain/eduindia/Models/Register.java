package com.example.vartikajain.eduindia.Models;

import java.util.Date;

/**
 * Created by VARTIKA JAIN on 29-03-2018.
 */

public class Register {
    int id;
    String username;
    String email;
    String contact_no;
    String dob;
    String address;
    String gender;
    String pass_no;
    String religion;
    String nationality;
    String school;
    String university;
    int marks_10;
    int marks_12;
    int marks_uni;

    public Register(int id, String username, String email, String contact_no, String dob, String address, String gender,
                    String pass_no, String religion, String nationality, String school, String university,
                    int marks_10, int marks_12, int marks_uni) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.contact_no = contact_no;
        this.dob = dob;
        this.address = address;
        this.gender = gender;
        this.pass_no = pass_no;
        this.religion = religion;
        this.nationality = nationality;
        this.school = school;
        this.university = university;
        this.marks_10 = marks_10;
        this.marks_12 = marks_12;
        this.marks_uni = marks_uni;
    }

    public Register(String username, String email, String contact_no, String dob, String address, String gender,
                    String pass_no, String religion, String nationality, String school, String university,
                    int marks_10, int marks_12, int marks_uni) {
        this.username = username;
        this.email = email;
        this.contact_no = contact_no;
        this.dob = dob;
        this.address = address;
        this.gender = gender;
        this.pass_no = pass_no;
        this.religion = religion;
        this.nationality = nationality;
        this.school = school;
        this.university = university;
        this.marks_10 = marks_10;
        this.marks_12 = marks_12;
        this.marks_uni = marks_uni;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getContact_no() {
        return contact_no;
    }

    public String getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getPass_no() {
        return pass_no;
    }

    public String getReligion() {
        return religion;
    }

    public String getNationality() {
        return nationality;
    }

    public String getSchool() {
        return school;
    }

    public String getUniversity() {
        return university;
    }

    public int getMarks_10() {
        return marks_10;
    }

    public int getMarks_12() {
        return marks_12;
    }

    public int getMarks_uni() {
        return marks_uni;
    }
}
