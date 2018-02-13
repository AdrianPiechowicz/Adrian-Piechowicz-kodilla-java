package com.kodilla.spring.board;

import com.kodilla.spring.portfolio.Board;
import com.kodilla.spring.portfolio.BoardConfig;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testAddTask() {
        //When
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //given
        boolean result1 = board.getToDoList().getTasks().add("Eat dinner");
        boolean result2 = board.getInProgressList().getTasks().add("Finish project.");
        boolean result3 = board.getDoneList().getTasks().add("Clean the table.");

        //then
        System.out.println(board.getToDoList().getTasks().get(0));
        System.out.println(board.getInProgressList().getTasks().get(0));
        System.out.println(board.getDoneList().getTasks().get(0));
    }
}
