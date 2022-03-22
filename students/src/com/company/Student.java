package com.company;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String surname;
    private int age;
    private int course;
    private boolean homework;
    private java.util.List<Student> studentList;
    private java.util.List<String> subjectList;
    private java.util.List<String> offsetList;
    private java.util.List<String> examList;


    public Student (String name, String surname, int age, int course, boolean homework){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.course = course;
        this.homework = homework;
        this.studentList = new ArrayList<>();
        this.subjectList = new ArrayList<>();
        this.offsetList = new ArrayList<>();
        this.examList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public boolean isHomework() {
        return homework;
    }

    public void setHomework(boolean homework) {
        this.homework = homework;
    }
    public void addStudent (Student student) {
        studentList.add(student);
    }
    public void addSubject (String subject) {
        subjectList.add(subject);
}
    public void addOffset (String offset) {
        offsetList.add(offset);
}
    public void addExam (String exam) {
        examList.add(exam);
}}
