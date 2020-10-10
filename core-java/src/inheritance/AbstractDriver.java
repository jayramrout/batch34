package inheritance;

public class AbstractDriver {
    public static void main(String[] args) {
        SportsTeacher steacher = new SportsTeacher(104,"MIT","Soccer",23);
        steacher.teacherTiming(); // 8:00 am or 6:00 am ?????
        steacher.teachingDuration();

//        Teacher teacher = new Teacher(11,"","",22);
        // in order for any caller to create an instance of a super class..

        ChemistryTeacher chemistryTeacher
                = new ChemistryTeacher(1055,"MIT","Soccer",23);
        chemistryTeacher.dressing();
    }
}
