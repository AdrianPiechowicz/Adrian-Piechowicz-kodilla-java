package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    List<ForumUser> usersList = new ArrayList<>();

    public Forum(){
        usersList.add(new ForumUser(1,"Nick1 ",'M', LocalDate.of(1993,2,22),5));
        usersList.add(new ForumUser(2,"Bart",'M', LocalDate.of(2000,5,25),6));
        usersList.add(new ForumUser(3,"Forumuser123",'F',LocalDate.of(1999,9,12),1));
        usersList.add(new ForumUser(4,"Carls", 'F', LocalDate.of(2005,5,1),0));
        usersList.add(new ForumUser(5,"Janek", 'M', LocalDate.of(1992,5,1),100));
    }

    public List<ForumUser> getUsersList() {
        return usersList;
    }
}
