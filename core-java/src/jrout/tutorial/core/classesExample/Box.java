package jrout.tutorial.core.classesExample;
// POJO's Plain Old Java Object
public class Box {
    double width; // state
    double height;
    double depth;

    String name;
    public Box(){}

    public Box(String name){
        this.name = name;
        System.out.println("Box "+ name +" Got Created...");
    }

    protected void finalize() throws Throwable {
        System.out.println("Box "+ name +" is getting destroyed...");
    }

    // behaviour...
    // setter and getter method...

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
}
