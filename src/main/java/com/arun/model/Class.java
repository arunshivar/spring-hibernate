package com.arun.model;

import javax.persistence.*;

@Entity
@Table(name = "CLASS_TBL")
public class Class {

    private long classId;
    private String className;

    public Class(long classId, String className) {
        this.classId = classId;
        this.className = className;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CLASS_ID")
    public long getClassId() {
        return this.classId;
    }

    public void setClassId(long classId) {
        this.classId = classId;
    }

    @Column(name = "CLASS_NAME", nullable = false, length=15)
    public String getclassName() {
        return this.className;
    }

    public void setClassName(String className) {
        this.className = className;
    }



}
