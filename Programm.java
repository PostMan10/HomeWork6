package Lesson_6;

import java.security.SecureRandom;

public class Programm {

    public static void main(String[] args) {

        String tempWinEvent = " это получилось ";
        String tempLossEvent = " это не получилось ";
        String eventName;
        String eventResult;

        Cat cat1 = new Cat("Барсик", 2f, 200);
        Cat cat2 = new Cat("Мурзик", 1.5f, 400);
        Dog dog1 = new Dog("Тузик", 0.5f, 500f);
        Dog dog2 = new Dog("Бобик", 1.5f, 350);

        Animal[] animals = {cat1, cat2, dog1, dog2};

        float runLenght = 250;
        float swimLenhgt = 8;

        for (int i = 0; i < animals.length; i++) {
            String nameString = animals[i].getType() + " " + animals[i].getName() + " может ";
            eventName = "пробежать на " + animals[i].getMaxRun() + " м. Пытается пробежать на ";
            eventResult = animals[i].run(runLenght) ? tempWinEvent : tempLossEvent;
            result(nameString, eventName, runLenght, eventResult);

            int swimResult = animals[i].swim(swimLenhgt);
            eventName = "проплыть на " + animals[i].getMaxSwim() + " м. Попытка проплыть на ";
            eventResult = (swimResult == Animal.swimOK) ? tempWinEvent : tempLossEvent;

            if (swimResult == Animal.swimNone)
                eventResult = " это не получилось, т. к. не умеет плавать";
            result(nameString, eventName, swimLenhgt, eventResult);
        }

    }

   private static void result(String nameAnimals, String event, float eventLenght, String resultEvent) {
       System.out.println(nameAnimals + event + eventLenght + " м и " + resultEvent);
   }

}
