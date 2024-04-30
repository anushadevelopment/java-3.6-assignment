package Assignment;

public class School implements Building{

    private String name;
    int numberOfFloors;
    String address;

    public School(){

    }
    public School(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    public String getAddress() {
        return address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public void addFloors(int floors) {     

        System.out.println("Total Floors : " + floors);
    }

    @Override
    public void describe() {
        System.out.println(" Name :" +this.name);
        System.out.println("Address is : "+this.address);
       
    }

    

    
}
