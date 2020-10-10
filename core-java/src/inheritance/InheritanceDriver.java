package inheritance;

public class InheritanceDriver {
    public static void main(String[] args) {
        SportsTeacher steacher = new SportsTeacher(104,"MIT","Soccer",23);
        printTeacherDetails(steacher);


//        Teacher teacher = new Teacher(100, "Burla","Physics", 15);
//        printTeacherDetails(teacher);
//        printPhysicsTeacherDetails(teacher); // you cannot do this.
        /*teacher.teachingDuration();
        teacher.dressing();
        teacher.teachingDuration();
        teacher.teacherTiming();*/

        Teacher pteacher = new PhysicsTeacher(102,"Umass","Physics",21);
        printTeacherDetails(pteacher);

        PhysicsTeacher physicsTeacher = (PhysicsTeacher) pteacher;

        // Super class follow by Subclass
          // This is not possible
//          SportsTeacher st = (SportsTeacher)pteacher;
//          SportsTeacher st = (SportsTeacher)teacher;


    }

    public static void printTeacherDetails(Teacher teacher){
        teacher.teachingDuration();
        teacher.dressing();
        teacher.teachingDuration();
        teacher.teacherTiming();

        if(teacher instanceof SportsTeacher) {
            SportsTeacher st =(SportsTeacher)teacher;
            st.joggingTime();
        }
    }




}
