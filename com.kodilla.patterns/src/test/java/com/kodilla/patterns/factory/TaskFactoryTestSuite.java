package com.kodilla.patterns.factory;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TasksFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TasksFactory tasksFactory = new TasksFactory();

        //When
        Task task = tasksFactory.makeTask(TasksFactory.ShoppingTask);

        //Then
        Assert.assertEquals("Grocery",task.getTaskName());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TasksFactory tasksFactory = new TasksFactory();

        //When
        Task task = tasksFactory.makeTask(TasksFactory.DrivingTask);

        //Then
        Assert.assertEquals("To school",task.getTaskName());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TasksFactory tasksFactory = new TasksFactory();

        //When
        Task task = tasksFactory.makeTask(TasksFactory.PaintingTask);

        //Then
        Assert.assertEquals("Paint balcony",task.getTaskName());
    }

    @Test
    public void testExecuteTask() {
        //Given
        TasksFactory tasksFactory = new TasksFactory();

        //When
        Task task = tasksFactory.makeTask(TasksFactory.PaintingTask);
        task.executeTask();

        //Then
        Assert.assertEquals(true,task.isTaskExecuted());
    }
}
