package Assignment;

public class Teacher1 extends Person1{
    public String subject;

    public String getSubject(){
        return subject;
    }
    public void SetSubject(String subject){
        this.subject = subject;
    }
    public Teacher1(int age, String subject){
        super(age);
        this.subject = subject;

    }

    public Teacher1(int age) {
        super(age);
    }

    
}
