package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.*;

public class ForumUserTestSuite {

    @Test
    public void update() {
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(ivoneEscobar);

        //when
        javaHelpForum.addPost("Hi!");
        javaHelpForum.addPost("Bye!");
        javaToolsForum.addPost("Hello");
        javaToolsForum.addPost("Let's help somebody!");

        //then
        assertEquals(2,johnSmith.getUpdateCount());
        assertEquals(2,ivoneEscobar.getUpdateCount());
        assertEquals(4,jessiePinkman.getUpdateCount());
    }
}