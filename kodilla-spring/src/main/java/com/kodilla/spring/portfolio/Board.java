package com.kodilla.spring.portfolio;

import java.util.ArrayList;

public class Board {
    private TaskList toDoList = new TaskList(new ArrayList<String>());
    private TaskList inProgressList = new TaskList(new ArrayList<String>());
    private TaskList doneList = new TaskList(new ArrayList<String>());

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
