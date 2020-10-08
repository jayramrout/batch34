package inheritance;
/*
    The behaviour is been derived by the state.
 */
public class Teacher {
    private int id;  // state
    private String name;
    private String subject;
    private String collegeName;
    private int yearsOfExperience; // 10 --> 1.5 hr , 20 --> 1 hr

    public Teacher(int id, String collegeName, String subject, int yearsOfExperience) {
        this.id = id;
        this.collegeName = collegeName;
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    /**
     * Behaviour
     */
    public void teacherTiming(){
        System.out.println("I have to go to school/collage by 8:00 am");
    }

    public void dressing(){
        System.out.println("I should wear white dress ..");
    }

    public void teachingDuration() {
        if(this.yearsOfExperience >= 20){
            System.out.println("Teaching duration is just 1 hr");
        }else {
            System.out.println("Teaching duration is just 1.5 hr");
        }
    }
}
