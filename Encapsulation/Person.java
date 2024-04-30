package Encapsulation;

public class Person {

    //  private String name;
    //  private int birthYear;

    protected  String name;
    protected  int birthYear;

     public Person(){
     }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        if (birthYear <1990 || birthYear >2022){
            System.out.println("Invalid Birth Year");
        }
        this.birthYear = birthYear;
    }

    public void greet(){
        System.out.println("Hello my name is " +this.name + " and my birthyear is " + this.birthYear + " " + this.getClass().getSimpleName().toLowerCase() + ".");
    }
    public void doWork(){
        System.out.println(this.name + " is working");
    }
}