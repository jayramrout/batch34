package inheritance.sports;

/*
    The behaviour is been derived by the state.
 */
public class VolleyBallTeacher extends SportsTeacher {

    public VolleyBallTeacher(int id, String collegeName, String subject, int yearsOfExperience) {
        super(id, collegeName, subject, yearsOfExperience);
    }

    @Override
    public void eatingHabits() {
        System.out.println(myProtection);
    }
}
