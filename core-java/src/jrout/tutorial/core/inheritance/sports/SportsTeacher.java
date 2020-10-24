package jrout.tutorial.core.inheritance.sports;

import jrout.tutorial.core.inheritance.Cooking;
import jrout.tutorial.core.inheritance.Swimming;
import jrout.tutorial.core.inheritance.Teacher;

/*
    The behaviour is been derived by the state.
 */
public abstract class SportsTeacher extends Teacher implements Swimming, Cooking {
    private boolean doesTeachYoga;

    // Cooking cooking = new SportsTeacher();

    public SportsTeacher(int id, String collegeName, String subject, int yearsOfExperience) {
        super(id, collegeName, subject, yearsOfExperience);
    }


    public void joggingTime(){
        System.out.println( getName()+"At least jog for 1/2 hr.");
    }

    @Override
    public void teacherTiming() {
        System.out.println("Teacher timing is 6:00 am mon/friday");
    }

    @Override
    public void dressing() {
        System.out.println("Sports teacher should always keep a whistle around their neck...");
    }

    @Override
    public void swim() {
        System.out.println("Being a inheritance.sports teacher..i should know how to swim...");
    }

    @Override
    public void cook() {
        System.out.println("Sports teacher is good at cooking");
    }

    public abstract void eatingHabits();
}
