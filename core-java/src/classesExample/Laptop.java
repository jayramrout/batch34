package classesExample;

public class Laptop {
    // name of the class should same as constructor
    // constructors does not have a return type.

    private String name;
    private double cost;
    private String color;
    private String processor;

    public Laptop(){ } // Default Constructor

    public Laptop(String name) {
        this.name = name;
    }

    public Laptop(String name , double cost) {
        this.name = name;
        this.cost = cost;
    }

    // Constructor Overloading
    public Laptop(String name , double cost, String color) {
//        this.name = name;
//        this.cost = cost;
        this(name,cost); // constructor chaining...
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printDetails(){
//        System.out.println(this.name +" "+ this.color +" "+ this.cost);
        System.out.println(String.format("The Name is {%s} Color is {%s}, Cost is {%s}", this.name, this.color, this.cost));
        System.out.println("The Name is "+ this.name +" Color is "+ this.color +" Cost is "+this.cost);
    }

}