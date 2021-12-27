package Lesson_6;


    public abstract class Animal {
        static final int swimFail = 0;
        static final int swimOK = 1;
        static final int swimNone = -1;


    private String type;
    private String name;
    private float maxRun;
    private float maxSwim;

    Animal(String type, String name, float maxRun, float maxSwim) {
        this.type = type;
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    String getName() {
        return this.name;
    }

    String getType() {
        return this.type;
    }

    float getMaxRun() {
        return this.maxRun;
    }

    float getMaxSwim() {
        return this.maxSwim;
    }

    protected boolean run(float distance) {
        return (distance <= maxRun);
    }

    protected int swim(float distance) {
        return (distance <= maxSwim) ? swimOK : swimFail;
    }

}
