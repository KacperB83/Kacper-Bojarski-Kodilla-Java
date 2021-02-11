package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public final class ShoppingTask implements Task{
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private List<ShoppingTask> tasksExecuted = new ArrayList<>();

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("The task "+ taskName + " has been executed.");
        tasksExecuted.add(new ShoppingTask(getTaskName(), getWhatToBuy(), getQuantity()));
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public Boolean isTaskExecuted() {
        for(ShoppingTask s : tasksExecuted) {
            if (s.equals(new ShoppingTask(getTaskName(), getWhatToBuy(), getQuantity())));
            return true;
            }
        return false;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    public List<ShoppingTask> getTasksExecuted() {
        return tasksExecuted;
    }
}
