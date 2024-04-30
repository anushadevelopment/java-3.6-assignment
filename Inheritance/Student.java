package Inheritance;
import java.util.ArrayList;

import Encapsulation.Person;

public class Student extends Person{

    private int studentId;
    private String course;
    private int yearsEnrolled;
    private ArrayList<Double> grades;

    public Student(String name, int birthYear,int studentid, String course, int yearsEnrolled){
        super(name, birthYear);
        this.studentId = studentid;
        this.course = course;
        this.yearsEnrolled = yearsEnrolled;
        this.grades = new ArrayList<Double>();
    }

    public int getStudentId() {
        return studentId;
    }
    public String getCourse() {
        return course;
    }
    public int getYearsEnrolled() {
        return yearsEnrolled;
    }
    public ArrayList<Double> getGrades() {
        return grades;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void setYearsEnrolled(int yearsEnrolled) {
        this.yearsEnrolled = yearsEnrolled;
    }
    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }

    public void addGrades(double grade){
        this.grades.add(grade);
    }
    public double getAverageGrade(){
        double sum = 0;
        for (double grade : this.grades){
            sum += grade;
        }
        return sum / this.grades.size();
    }   
}




