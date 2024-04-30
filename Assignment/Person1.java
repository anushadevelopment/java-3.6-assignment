package Assignment;

public class Person1 {
    private String name;
    private int age;
    private String gender;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Person1(int age){
        this.age = age;
    }

    public void greet1(){
        System.out.println("Enter your name");
        String name = System.console().readLine();
        this.setName(name);
        System.out.println("Nice to meet you " +name);
    }
    public void introduce(){
        System.out.println("Hello, My name is " +this.name);

    }
    public void haveBirthday(){
        System.out.println(" Age is " +(this.age+1));

    }


}
