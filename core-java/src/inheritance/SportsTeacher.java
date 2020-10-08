package inheritance;
/*
    The behaviour is been derived by the state.
 */
public class SportsTeacher extends Teacher {
    private boolean doesTeachYoga;

    public SportsTeacher(int id, String collegeName, String subject, int yearsOfExperience) {
        super(id, collegeName, subject, yearsOfExperience);
    }


    public void joggingTime(){
        System.out.println("At least jog for 1/2 hr.");
    }
}
