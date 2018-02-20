package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSettings() {
        //Given
        User alan = new Millenials("Alan123");
        User john = new YGeneration("Johhhhhny");
        User jane = new ZGeneration("MYnick");

        //When
        String alanShare = alan.getPreferedSocialMedia().share();
        System.out.println(alan.getName()+" uses "+alanShare);
        String johnShare = john.getPreferedSocialMedia().share();
        System.out.println(john.getName()+" uses "+johnShare);
        String janeShare = jane.getPreferedSocialMedia().share();
        System.out.println(jane.getName()+" uses "+janeShare);

        //Then
        Assert.assertEquals("Facebook",alanShare);
        Assert.assertEquals("Twitter",johnShare);
        Assert.assertEquals("SnapChat",janeShare);
    }

    @Test
    public void testChangeSettings() {
        //Given
        User alan = new Millenials("Alan123");

        //When
        String alanShare = alan.getPreferedSocialMedia().share();
        System.out.println(alan.getName()+" default use is "+alanShare);
        alan.setPreferedSocialMedia(new Twitter());
        String newAlanShare = alan.getPreferedSocialMedia().share();
        System.out.println(alan.getName()+" changed his best social media to "+newAlanShare);

        //Then
        Assert.assertEquals("Twitter",newAlanShare);
    }
}
