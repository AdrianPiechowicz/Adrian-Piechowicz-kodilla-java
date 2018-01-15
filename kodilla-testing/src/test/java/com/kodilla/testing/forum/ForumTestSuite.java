package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.*;
public class ForumTestSuite {
    @Before
    public void before1(){
        System.out.println("Rozpoczeto test.");
    }
    @After
    public void after(){
        System.out.println("Zakonczono test.");}

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testCaseUsername(){


        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getUsername();
        System.out.println("Test "+result);

        //Then
        Assert.assertEquals("theForumUser", result);
    }

    @Test
    public void testCaseRealName(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Test "+result);
        //Then
        Assert.assertEquals("John Smith", result);
    }
}