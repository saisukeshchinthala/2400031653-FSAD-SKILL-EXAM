package com.model;

import java.io.Serializable;

public class Student implements Serializable {
private static final long serialVersionUID = 1L;
    private int sid;
    private String sname;
    private double smarks;

    // No-arg constructor (VERY IMPORTANT for Hibernate)
    public Student() {
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public double getSmarks() {
        return smarks;
    }

    public void setSmarks(double smarks) {
        this.smarks = smarks;
    }
}