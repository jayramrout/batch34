package jrout.tutorial.core.classesExample;
// POJO's Plain Old Java Object
public class Box {
    double width; // state
    double height;
    double depth;

    String name;
    static int counter = 0;
    public Box(){
        System.out.println("Invoking box empty constructor");
        counter++;
    }

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

    public static void main(String[] args) {
        try {
            Class.forName("jrout.tutorial.core.classesExample.Box").newInstance();
            System.out.println(Box.counter);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
