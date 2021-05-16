package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskQueTestSuite {

    private static String kacper = "Kacper";

    @Test
    void testTaskUpdate() {
        //Given
        Mentor lukasz = new Mentor("Lukasz");
        Mentor mateusz = new Mentor("Mateusz");

        TaskQue tasksForLukasz = new TaskQue(kacper);
        TaskQue tasksForMateusz = new TaskQue(kacper);
        tasksForLukasz.registerObserver(lukasz);
        tasksForMateusz.registerObserver(mateusz);
        //When
        tasksForLukasz.addTask(new Task("Moduł 24.4", "Zadanie kolejki z zadaniami"));
        tasksForLukasz.addTask(new Task("Moduł 24.3", "Zadanie logowanie żądań do fasady"));
        tasksForLukasz.addTask(new Task("Moduł 24.2", "Zadanie dekorujemy pizzę"));
        tasksForLukasz.doneTask(new Task("Moduł 24.4", "Zadanie kolejki z zadaniami"));

        tasksForMateusz.addTask(new Task("Group project", "Cart Controller - final version"));
        //Then
        assertEquals(1, mateusz.getUpdateCount());
        assertEquals(4, lukasz.getUpdateCount());


    }
}
