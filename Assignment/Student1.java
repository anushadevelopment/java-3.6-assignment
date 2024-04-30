package Assignment;

public class Student1 extends Person1{
    private String yrLevel;


    public void introduce(){
        System.out.println("Hello my name is "+this.getName() + " I am a "
        +yrLevel +" student");
    }


    public String getYrLevel() {
        return yrLevel;
    }


    public void setYrLevel(String yrLevel) {
        this.yrLevel = yrLevel;
    }


    public Student1(int age, String yrLevel) {
        super(age);
        this.yrLevel = yrLevel;
    }

    
}
