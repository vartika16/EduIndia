package com.example.vartikajain.eduindia.Models;

/**
 * Created by VARTIKA JAIN on 30-03-2018.
 */

public class signup {

    int signid;
    String fname,lname,uname,pswrd;

    public signup(int signid, String fname, String lname, String uname, String pswrd) {
        this.signid = signid;
        this.fname = fname;
        this.lname = lname;
        this.uname = uname;
        this.pswrd = pswrd;
    }

    public signup(String fname, String lname, String uname, String pswrd) {
        this.fname = fname;
        this.lname = lname;
        this.uname = uname;
        this.pswrd = pswrd;
    }

    public int getId() {
        return signid;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getUname() {
        return uname;
    }

    public String getPswrd() {
        return pswrd;
    }
}
