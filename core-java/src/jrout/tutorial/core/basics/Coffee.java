package jrout.tutorial.core.basics;

public enum Coffee {

    LARGE(5), MEDIUM(3), SMALL(2);

    private int value;
    Coffee(int val){
        this.value = val;
    }

    public int getValue(){
        return this.value;
    }

//    JAN(1), FEB(2);
}
