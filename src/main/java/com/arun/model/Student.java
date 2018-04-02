package com.arun.model;


import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "STUDENT_TBL")
public class Student implements Serializable {

    private long studentId;
    private String studentName;
    private Address studentAddress;
    private Set<Class> classes = new HashSet<Class>(0);

    public Student() {
    }

    public Student(String studentName, Address studentAddress, Set<Class> classes) {
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.classes = classes;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "STUDENT_ID")
    public long getStudentId() {
        return this.studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    @Column(name = "STUDENT_NAME", nullable = false, length = 100)
    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ADDRESS_ID")
    public Address getStudentAddress() {
        return this.studentAddress;
    }

    public void setStudentAddress(Address studentAddress) {
        this.studentAddress = studentAddress;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "STUDENT_CLASS",
            joinColumns = { @JoinColumn(name = "STUDENT_ID") },
            inverseJoinColumns = { @JoinColumn(name = "CLASS_ID") })
    public Set<Class> getClasses() {
        return this.classes;
    }

    public void setClasses(Set<Class> classes) {
        this.classes = classes;
    }

}