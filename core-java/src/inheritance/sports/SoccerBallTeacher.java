package inheritance.sports;
/*
    The behaviour is been derived by the state.
 */
public class SoccerBallTeacher extends SportsTeacher {

    public SoccerBallTeacher(int id, String collegeName, String subject, int yearsOfExperience) {
        super(id, collegeName, subject, yearsOfExperience);
    }

    @Override
    public void eatingHabits() {

    }

}
