
import Inheritance.Student;
import Inheritance.Teacher;
import Abstract.Car;
import Assignment.School;
import Assignment.Student1;
import Assignment.Teacher1;
import Assignment.Person1;
import Encapsulation.Person;
public class App {
    public static void main(String args[]){

        // Person person = new Person("Tony Shark", 1975);
        // // // person1.setBirthYear(0);
        // // // person1.doWork();
        // // // person1.greet();

       

        // Student student = new Student("Tooney",1985,1, "Computer Science", 2024);
        // // student1.setName("muthu");
        // student.greet();
        // student.doWork();
        // System.out.println("I am studying " + student.getCourse());
        // student.addGrades(100);
        // student.addGrades(90);
        // System.out.println("My average Score is : " + student.getAverageGrade());
        // Teacher teacher = new Teacher("John", 1988, 1, "Mathematics", 5000);
        // teacher.greet();
        // teacher.doWork();
        // System.out.println("I teach " +teacher.getSubject());
        // System.out.println("My salary is "+teacher.getSalary());

        // Car car  = new Car("Toyota", 2022);
        // car.track();
        // car.drive();
        // car.stop();

        // School school = new School("Edgefield Primary School" ,"Edgefield Plains, Punggol");
        // school.addFloors(50);
        // school.describe();


        Person1 person1 = new Person1(20);
        Student1 student1 = new Student1(20, "II");
        student1.greet1();
        student1.introduce();
        student1.haveBirthday();

        Student1 student2 = new Student1(21, "III");
        student2.greet1();
        student2.introduce();
        student2.haveBirthday();



        Teacher1 teacher1 = new Teacher1(40);
        teacher1.greet1();
        teacher1.introduce();
        teacher1.haveBirthday();

        School school = new School("Edgefield Primary School","Edgefield plains , Punggol");
        school.addFloors(45);
        school.describe();



        
    }    
}



