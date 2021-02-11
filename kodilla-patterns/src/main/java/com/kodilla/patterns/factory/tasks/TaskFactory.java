package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task newTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Buying clothes", "Jeans", 2);
            case PAINTING:
                return new PaintingTask("Painting", "black", "dot");
            case DRIVING:
                return new DrivingTask("Driving", "in park", "bicycle");
            default:
                return null;
        }
    }
}
