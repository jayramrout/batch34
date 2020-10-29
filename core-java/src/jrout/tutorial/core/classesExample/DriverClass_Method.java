package jrout.tutorial.core.classesExample;

public class DriverClass_Method {
    public static void main(String[] args) {
        DriverClass_Method driver = new DriverClass_Method();
        driver.printMyName("Peter");
    }

    // a function has it own signature
    // have a return type or void ...follow by the name of the function.
    // it may or may not have arguments to pass...
    public void printMyName(String name) {
        System.out.println("************");
        System.out.println(name);
        System.out.println("************");
    }
}
