package com.arun.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="TEACHER_TBL")
public class Teacher {

    private long teacherID;
    private String teacherName;
    private Set<Class> teacherClasses = new HashSet<Class>(0);

    public Teacher(long teacherID, String teacherName) {

        this.teacherID = teacherID;
        this.teacherName = teacherName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TEACHER_ID")
    public long getTeacherID() {
        return this.teacherID;
    }

    public void setTeacherID(long teacherID) {
        this.teacherID = teacherID;
    }

    @Column(name = "TEACHER_NAME", nullable = false, length = 100)
    public String getTeacherName() {
        return this.teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }


    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "TEACHER_CLASSES",
            joinColumns = { @JoinColumn(name = "TEACHER_ID") },
            inverseJoinColumns = { @JoinColumn(name = "CLASS_ID") })
    public Set<Class> getTeacherClasses() {
        return this.teacherClasses;
    }

    public void setTeacherClasses(Set<Class> teacherClasses) {
        this.teacherClasses = teacherClasses;
    }
}
