package com.arun.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="TEACHER_TBL")
public class Teacher {

    private long teacherID;
    private String teacherName;


    private List<Course> courses = new ArrayList<Course>();

    public Teacher(long teacherID, String teacherName, List<Course> courses) {
        this.teacherID = teacherID;
        this.teacherName = teacherName;
        this.courses = courses;
    }

    public Teacher() {}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TEACHER_ID")
    public long getTeacherID() {
        return teacherID;
    }


    public void setTeacherID(long teacherID) {
        this.teacherID = teacherID;
    }

    @Column(name = "TEACHER_NAME", nullable = false, length = 100)
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @OneToMany(mappedBy="teacher", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
