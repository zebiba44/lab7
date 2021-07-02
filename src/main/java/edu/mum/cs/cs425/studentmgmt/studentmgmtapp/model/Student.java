package edu.mum.cs.cs425.studentmgmt.studentmgmtapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.StringJoiner;
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;



    @NotNull(message = "student number is required, cannot be null")
    @NotEmpty(message = "student number is required cannot be empty")
    @NotBlank(message = "student number is required cannot be blank")
    private String studentNumber;
    @NotNull(message = "student number is required cannot be null")
    @NotEmpty(message = "student number is required cannot be empty")
    @NotBlank(message = "student number is required cannot be blank")
    private String firstName;
    private String middleName;
    @NotNull(message = "student number is required cannot be null")
    @NotEmpty(message = "student number is required cannot be empty")
    @NotBlank(message = "student number is required cannot be blank")
    private String lastName;
    private Double cgpa;
    private LocalDate dateOfEnrollment;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "classroom_id", nullable = true)
    private Classroom classroom;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "transcript_id", nullable = true)
    private Transcript transcript;

    public Student(String studentNumber, String firstName, String middleName, String lastName, Double cgpa, LocalDate dateOfEnrollment) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public Student(Integer studentId, String studentNumber, String firstName, String middleName, String lastName, Double cgpa, LocalDate dateOfEnrollment) {
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public Student() {
    }

    public Student(String studentNumber, String firstName, String middleName, String lastName, Double cgpa, LocalDate dateOfEnrollment, Classroom classroom, Transcript transcript) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
        this.classroom = classroom;
        this.transcript = transcript;
    }

    public Student(Integer studentId, String studentNumber, String firstName, String lastName, LocalDate dateOfEnrollment) {
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDate getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("studentId=" + studentId)
                .add("studentNumber='" + studentNumber + "'")
                .add("firstName='" + firstName + "'")
                .add("middleName='" + middleName + "'")
                .add("lastName='" + lastName + "'")
                .add("cgpa=" + cgpa)
                .add("dateOfEnrollment=" + dateOfEnrollment)
                .toString();
    }
}
