package com.kodilla.patterns2.observer.homework;

public class Task {
    private String title;
    private String content;

    public Task(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
