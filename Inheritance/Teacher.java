 package Inheritance;
 import Encapsulation.Person;

 public class Teacher extends Person{
    private int teacherId;
    private String subject;
    private double salary;

    public Teacher(String name, int birthYear, int teacherId, String subject, double salary) {
        super(name, birthYear);
        this.teacherId = teacherId;
        this.subject = subject;
        this.salary = salary;
    }
    public int getTeacherId() {
        return teacherId;
    }
    public String getSubject() {
        return subject;
    }
    public double getSalary() {
        return salary;
    }
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // @Override
    // public void doWork(){
    //     System.out.println(this.name + " is studying");

    // }
    
}
