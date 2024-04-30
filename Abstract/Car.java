package Abstract;

public class Car implements Trackable, Drivable {
    private String name;
    private int year;

    public Car(){
    }
    public Car(String name, int year){
        this.name = name;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }   
    public void setName(String name) {
        this.name = name;
    }
    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public void track(){
        System.out.println("Tracking car ...");
    }

    @Override
    public void drive() {
     
        System.out.println("Driving car...");
    }

    @Override
    public void stop() {
    
        System.out.println("Stopping car ..");
    }
    
}
