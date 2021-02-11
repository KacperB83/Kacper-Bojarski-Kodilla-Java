package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;

@Configuration
public class BoardConfig {

    @Qualifier("inProgressList")
    @Autowired
    TaskList taskList;

    @Bean
    public Board getBoard() {
        return new Board(taskList);
    }

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList getToDoList() {

        return new TaskList(Arrays.asList("toDoTask"));
    } 
    
    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList getInProgressList() {

        return new TaskList(Arrays.asList("inProgressTask"));
    } 
    
    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList getDoneList() {

        return new TaskList(Arrays.asList("doneTask"));
    }

}
