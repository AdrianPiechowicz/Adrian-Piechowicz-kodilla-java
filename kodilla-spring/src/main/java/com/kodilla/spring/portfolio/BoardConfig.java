package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("list1")
    TaskList toDoTasks;
    TaskList inProgressTasks;
    TaskList doneTasks;

    @Bean
    public Board getBoard(){
        return new Board(toDoTasks,inProgressTasks, doneTasks);
    }

    @Bean("list1")
    @Scope("prototype")
    public TaskList getToDoTasks() {
        return new TaskList(new ArrayList<String>());
    }

    @Bean("list2")
    @Scope("prototype")
    public TaskList getInProgressTasks() {
        return new TaskList(new ArrayList<String>());
    }

    @Bean("list3")
    @Scope("prototype")
    public TaskList getDoneTasks() {
        return new TaskList(new ArrayList<String>());
    }
}
