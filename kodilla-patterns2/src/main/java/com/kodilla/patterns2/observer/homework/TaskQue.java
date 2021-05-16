package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQue implements Observable{
    private final String studentName;
    private List<Task> tasks;
    private Observer observer;
    private String status;

    public TaskQue(String studentName) {
        this.studentName = studentName;
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        this.status = "added";
        notifyObserver();
    }

    public void doneTask(Task task) {
        tasks.remove(task);
        this.status = "done and removed";
        notifyObserver();
    }

    @Override
    public void registerObserver(Mentor mentor) {
        this.observer = mentor;
    }

    @Override
    public void notifyObserver() {
        observer.tasksUpdate(this);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public String getStatus() {
        return status;
    }

    public String getStudentName() {
        return studentName;
    }
}
