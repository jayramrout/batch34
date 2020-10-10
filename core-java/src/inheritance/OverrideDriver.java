package inheritance;

public class OverrideDriver {
    public static void main(String[] args) {
//        Teacher steacher = new SportsTeacher(104,"MIT","Soccer",23);
//        steacher.teacherTiming(); // 8:00 am or 6:00 am ?????
        // run time polymorphysm

        Teacher pteacher = new PhysicsTeacher(104,"MIT","Soccer",23){
            @Override
            public void teacherTiming() {
                System.out.println("My timings are 12 noon....");
            }
        };

        pteacher.teacherTiming();

        System.out.println(pteacher); // toString is used to print the reference details...
    }
}
