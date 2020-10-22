package inheritance;
/*
    The behaviour is been derived by the state.
 */
public class PhysicsTeacher extends Teacher{
    private int yearsOfLabExperience;
    private int yearOfIndustrialExperience;

    // this()
    // this
    public PhysicsTeacher(int id, String collegeName, String subject, int yearsOfExperience) {
        super(id, collegeName, subject, yearsOfExperience);
    }


    public int getYearsOfLabExperience() {
        return yearsOfLabExperience;
    }

    public void setYearsOfLabExperience(int yearsOfLabExperience) {
        this.yearsOfLabExperience = yearsOfLabExperience;
    }

    public int getYearOfIndustrialExperience() {
        return yearOfIndustrialExperience;
    }

    public void setYearOfIndustrialExperience(int yearOfIndustrialExperience) {
        this.yearOfIndustrialExperience = yearOfIndustrialExperience;
    }

    @Override
    public String toString() {
        return "This is a physics teacher with "+ yearsOfLabExperience +" lab years of exp";
    }

    @Override
    public void dressing() {
        System.out.println("Physics teacher should always have a small binacular around their neck..");
    }
}
