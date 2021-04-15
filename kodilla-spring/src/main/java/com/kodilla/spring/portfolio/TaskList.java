package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    final List<String> tasks;

    public TaskList(final List<String> tasks) {
        this.tasks = new ArrayList<>(tasks);
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "tasks = " + tasks +
                '}';
    }
}
