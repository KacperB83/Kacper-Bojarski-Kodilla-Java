package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void tasksUpdate(TaskQue taskQue) {
        System.out.println(name + ": task was " + taskQue.getStatus() + " by "+ taskQue.getStudentName());
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
