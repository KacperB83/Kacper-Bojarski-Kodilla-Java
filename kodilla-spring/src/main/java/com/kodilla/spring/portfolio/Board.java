package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class Board {

    List<TaskList> toDoList = new ArrayList<>();
    List<TaskList> inProgressList = new ArrayList<>();
    List<TaskList> doneList = new ArrayList<>();
    private TaskList taskList;

    public Board(TaskList taskList) {

        if(taskList.equals("toDoTask")){
        toDoList.add(taskList);
        }
        if(taskList.equals("inProgressTask")){
        inProgressList.add(taskList);
        }
        if(taskList.equals("doneTask")){
        doneList.add(taskList);
        }
        this.taskList = taskList;
    }

    public List<String> showList() {
        return taskList.getTasks();
    }
}
