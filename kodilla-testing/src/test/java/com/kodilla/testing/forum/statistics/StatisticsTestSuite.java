package com.kodilla.testing.forum.statistics;

import org.junit.*;


import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;



import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    @BeforeClass
            public static void beforeClass(){
     System.out.println("Test suite begins.");}

    @AfterClass
            public static void afterClass(){
    System.out.println("Test suite ends.");}

    @Before
            public void before(){
    System.out.println("Test begin.");};

    @After
            public void after(){
        System.out.println("Test ends.");
    }

    @Test
    public void testGetUsersNames(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames= new ArrayList<String>();
        usersNames.add("Jan");
        usersNames.add("Wojtek");
        usersNames.add("Kamil");
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        AdvStatistics advanced = new AdvStatistics(statisticsMock);
        //when
        int temporaryValue = advanced.getUsersNames().size();

        //then
        Assert.assertEquals(3,temporaryValue);
    }

    @Test
    public void testGetPostCount(){
        //given
        Statistics statisticsmock = mock(Statistics.class);
        when(statisticsmock.postsCount()).thenReturn(500);
        AdvStatistics advanced = new AdvStatistics(statisticsmock);

        //when
        int temp = advanced.getPostCount();

        //then
        Assert.assertEquals(500, temp);
    }

    @Test
    public void testGetCommentsCount(){
        //given
        Statistics statisticsmock = mock(Statistics.class);
        when(statisticsmock.commentsCount()).thenReturn(1000);
        AdvStatistics advanced = new AdvStatistics(statisticsmock);

        //when
        int temp = advanced.getCommentsCount();

        //then
        Assert.assertEquals(1000,temp);
    }

    @Test
    public void testGetAvgPostPerUser(){
        //given
        Statistics statisticsmock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        usersNames.add("Jan");
        usersNames.add("Wojtek");
        usersNames.add("Kamil");
        when(statisticsmock.usersNames()).thenReturn(usersNames);
        when(statisticsmock.postsCount()).thenReturn(3000);
        AdvStatistics advanced = new AdvStatistics(statisticsmock);

        //when
        int temp = advanced.getAveragePostCountPerUser();

        //then
        Assert.assertEquals(1000 ,temp);
    }

    @Test
    public void testGetAvgPostPerUserZeroPosts(){
        //given
        Statistics statisticsmock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        usersNames.add("Jan");
        usersNames.add("Wojtek");
        usersNames.add("Kamil");
        when(statisticsmock.usersNames()).thenReturn(usersNames);
        when(statisticsmock.postsCount()).thenReturn(0);
        AdvStatistics advanced = new AdvStatistics(statisticsmock);

        //when
        int temp = advanced.getAveragePostCountPerUser();

        //then
        Assert.assertEquals(0 ,temp);
    }

    @Test
    public void testGetAvgPostPerUser1000Users(){
        //given
        Statistics statisticsmock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        for (int i = 0; i<1000; i++){
            usersNames.add("Wojtek");
        }
        when(statisticsmock.usersNames()).thenReturn(usersNames);
        when(statisticsmock.postsCount()).thenReturn(1000);
        AdvStatistics advanced = new AdvStatistics(statisticsmock);

        //when
        int temp = advanced.getAveragePostCountPerUser();

        //then
        Assert.assertEquals(1 ,temp);
    }

    @Test
    public void testGetAvgCommentsPerUser(){
        //given
        Statistics statisticsmock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>();
        usersNames.add("Jan");
        usersNames.add("Wojtek");
        usersNames.add("Kamil");
        when(statisticsmock.usersNames()).thenReturn(usersNames);
        when(statisticsmock.commentsCount()).thenReturn(150);
        AdvStatistics advanced = new AdvStatistics(statisticsmock);

        //when
        int temp = advanced.getAverageCommentsCountPerUser();

        //then
        Assert.assertEquals(50,temp);
    }

    @Test
    public void testGetAvgCommPerPostMoreComments(){
        //given
        System.out.println("More comments than post.");
        Statistics statisticsmock = mock(Statistics.class);
        when(statisticsmock.postsCount()).thenReturn(100);
        when(statisticsmock.commentsCount()).thenReturn(1000);
        AdvStatistics advanced = new AdvStatistics(statisticsmock);

        //when
        int temp = advanced.getAverageCommentsCountPerPost();

        //then
        Assert.assertEquals(10,temp);
    }

    @Test
    public void testGetAvgCommPerPost1MorePosts(){
        //given
        System.out.println("More posts than comments.");
        Statistics statisticsmock = mock(Statistics.class);
        when(statisticsmock.postsCount()).thenReturn(10000);
        when(statisticsmock.commentsCount()).thenReturn(1000);
        AdvStatistics advanced = new AdvStatistics(statisticsmock);

        //when
        int temp = advanced.getAverageCommentsCountPerPost();

        //then
        Assert.assertEquals(0.1,temp,0.5);
    }
}
