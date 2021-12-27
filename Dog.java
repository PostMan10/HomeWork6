package Lesson_6;

public class Dog extends Animal {

    public static String typeThisClass = "Собака";

    Dog(String name, float maxRun, float maxSwim) {
        super(typeThisClass, name, maxRun, maxSwim);
    }

}
