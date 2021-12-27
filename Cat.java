package Lesson_6;

public class Cat extends Animal {

    public static String typeThisClass = "Кот";

    Cat(String name, float maxRun, float maxSwim) {
        super(typeThisClass, name, maxRun, maxSwim);
    }

    @Override
    protected int swim(float distance) {
        return Animal.swimNone;
    }

}
