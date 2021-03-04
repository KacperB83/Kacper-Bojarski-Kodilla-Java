package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public List<TaskList> showLists() {
        List<TaskList> list = new ArrayList<>();
        list.add(toDoList);
        list.add(inProgressList);
        list.add(doneList);

        return list;
    }
}
