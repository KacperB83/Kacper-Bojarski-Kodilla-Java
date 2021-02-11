package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.newTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        assertEquals(true, shopping.isTaskExecuted());
        assertEquals("Buying clothes", shopping.getTaskName());
    }
    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.newTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        assertEquals(true, driving.isTaskExecuted());
        assertEquals("Driving", driving.getTaskName());
    }
    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.newTask(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        assertEquals(true, painting.isTaskExecuted());
        assertEquals("Painting", painting.getTaskName());
    }

}
