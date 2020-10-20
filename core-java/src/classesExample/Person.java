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

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
//                ", location='" + location + '\'' +
//                ", height=" + height +
//                ", education=" + education +
                '}';
    }

    int getHeight() {
        return height;
    }
    // default
    void setHeight(int height) {
        this.height = height;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }



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
