package inheritance;
/*
    The behaviour is been derived by the state.
 */
public class ChemistryTeacher extends Teacher {
    private boolean doesTeachYoga;

    public ChemistryTeacher(int id, String collegeName, String subject, int yearsOfExperience) {
        super(id, collegeName, subject, yearsOfExperience);
    }

    @Override
    public void dressing() {
        System.out.println("Chemistry teacher should always wear apron...");
    }


}
