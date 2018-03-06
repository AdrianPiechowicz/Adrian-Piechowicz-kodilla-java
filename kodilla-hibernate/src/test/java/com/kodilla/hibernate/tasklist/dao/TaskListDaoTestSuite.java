package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static String nameOfTheList = "IN PROGRESS";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList  = new TaskList(nameOfTheList,"asd");

        //When
        taskListDao.save(taskList);

        //Then
        int id = taskList.getId();
        TaskList resultList = taskListDao.findOne(id);
        Assert.assertEquals(id, resultList.getId());

        //CleanUp
        taskListDao.delete(id);
    }
}
