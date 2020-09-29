package classesExample;

public class Person {
    /*
        If anything(instance variable/property) is private, it can only be accessed
        inside the class...
     */
    private String name; // variable // instance variables // properties
    private int age; // encapsulate
    private String location;
    private int height;

    private Education education;

    // functions .. in this case it getters and setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }



    public void setName(String namex){
        name = namex;
    }

    public void setAge(int agex){
        if(agex <= 5)
            age = 21;
        else
            age = agex;
    }
    public void setLocation(String locationx){
        location = locationx;
    }



}
