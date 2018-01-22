package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> filteredMap = theForum.getUsersList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> (LocalDate.now().getYear() - forumUser.getBirthDate().getYear()) > 20)
                .filter(forumUser -> forumUser.getPostAmount()>1)
                .collect(Collectors.toMap(ForumUser::getIndexNo,forumUser -> forumUser));

        System.out.println("The filtered list have now "+ filteredMap.size()+" users.");
        filteredMap.entrySet().stream()
                .map(entry -> entry.getKey()+" : "+ entry.getValue())

                .forEach(System.out::println);

    }
}