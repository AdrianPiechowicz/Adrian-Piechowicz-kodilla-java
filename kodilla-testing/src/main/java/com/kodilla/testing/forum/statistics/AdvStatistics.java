package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class AdvStatistics {
    List<String> usersNames;
    int postCount;
    int commentsCount;
    int AveragePostCountPerUser ;
    int AverageCommentsCountPerUser ;
    int AverageCommentsCountPerPost ;

    public AdvStatistics(Statistics statistics){
        this.usersNames = statistics.usersNames();
        this.postCount = statistics.postsCount();
        this.commentsCount = statistics.commentsCount();
    }

    public List<String> getUsersNames() {
        return usersNames;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public int getAveragePostCountPerUser(){
        return postCount/(usersNames.size());
    }

    public int getAverageCommentsCountPerUser(){
        return AverageCommentsCountPerUser = commentsCount/(usersNames.size());
    }

    public int getAverageCommentsCountPerPost(){
        return AverageCommentsCountPerPost = commentsCount/postCount;
    }

    public void calculateAdvStatistics(Statistics statistics){
        this.usersNames=statistics.usersNames();
        this.postCount=statistics.postsCount();
        this.commentsCount=statistics.commentsCount();
        this.AveragePostCountPerUser=getAverageCommentsCountPerUser();
        this.AverageCommentsCountPerUser=getAverageCommentsCountPerUser();
        this.AverageCommentsCountPerPost=getAverageCommentsCountPerPost();
    }

    public void showStatistics(){
        System.out.println("User names:");

        for (String name: usersNames){
            System.out.println(name +"/n");}

        System.out.println("Posts count: "+getPostCount());
        System.out.println("Comments count: "+getCommentsCount());
        System.out.println("Average post count per user: "+getAveragePostCountPerUser());
        System.out.println("Average comment count per user: "+getAverageCommentsCountPerPost());
        System.out.println("Average comments count per post: "+getAverageCommentsCountPerPost());
    }
}