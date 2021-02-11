package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public final class PaintingTask implements Task{
    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private List<PaintingTask> executedTasks = new ArrayList<>();

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("The task "+ taskName + " has been executed.");
        executedTasks.add(new PaintingTask(getTaskName(), getColor(), getWhatToPaint()));
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public Boolean isTaskExecuted() {
        for (PaintingTask p : executedTasks) {
            if(p.equals(new PaintingTask(getTaskName(), getColor(), getWhatToPaint())));
            return true;
        }
        return false;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }
}
