package app;

// Father class
public class Person{
    // Variables
    private String name;
    private String address;

    // Constructors
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    // Getters
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }

    // Setters
    public void setAddress(String address){
        this.address = address;
    }

    // toString
    @ Override
    public String toString(){
        return (this.name + "(" + this.address + ")");
    }
}