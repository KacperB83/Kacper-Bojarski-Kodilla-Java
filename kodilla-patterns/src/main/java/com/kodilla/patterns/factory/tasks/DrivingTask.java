package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public final class DrivingTask implements Task{
    private final String taskName;
    private final String where;
    private final String using;
    private List<DrivingTask> tasksExecuted = new ArrayList<>();

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("The task "+ taskName + " has been executed.");
        tasksExecuted.add(new DrivingTask(getTaskName(), getWhere(), getUsing()));
    }
    @Override
    public Boolean isTaskExecuted() {
        for(DrivingTask d : tasksExecuted) {
            if(d.equals(new DrivingTask(getTaskName(), getWhere(), getUsing())));
                return true;
        }
        return false;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }
    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }
}
