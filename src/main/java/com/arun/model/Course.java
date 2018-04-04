package com.arun.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "COURSE_TBL")
public class Course {

    private long courseId;
    private String courseName;
    private Teacher teacher;

    List<Student> studentList;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COURSE_ID")
    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    @Column(name = "COURSE_NAME", nullable = false, length=15)
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @ManyToOne
    @JoinColumn(name="TEACHER_ID", nullable=false)
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @ManyToMany(mappedBy = "courses")
    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    /*private long classId;
    private String className;
    @ManyToOne
    @JoinColumn(name="TEACHER_ID", nullable=false)
    private Teacher teacher;
    @ManyToMany(mappedBy = "classes")
    private Set<Student> students = new HashSet<>();

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Class(long classId, String className, Teacher teacher, Set<Student> students) {
        this.classId = classId;
        this.className = className;
        this.teacher = teacher;
        this.students = students;
    }


    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Class() {

    }





    *//*@ManyToOne
    @JoinColumn(name = "TEACHER_ID")
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }*//*

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
    public String getClassName() {
        return this.className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
*/


}
