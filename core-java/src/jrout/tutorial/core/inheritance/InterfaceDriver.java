package jrout.tutorial.core.inheritance;

public class InterfaceDriver {
    public static void main(String[] args) {
//        SportsTeacher steacher = new SportsTeacher(104,"MIT","Soccer",23);
//        steacher.teacherTiming(); // 8:00 am or 6:00 am ?????
//        steacher.teachingDuration();
//        printSwimming(steacher);

        Tiger tiger = new Tiger();
        Swimming swimmingT = new Tiger(); // always try to code using the interface...
        printSwimming(swimmingT);

    }


    public static void printSwimming(Swimming swimming){
        swimming.swim();
    }


}
