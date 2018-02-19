package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLog() {
        //Given
        Logger.getInstance().log("This is last log.");
        //When
        String result = "Log: [" + Logger.getInstance().getLastLog() + "]";
        //Then
        Assert.assertEquals("Log: [This is last log.]",result);
    }
}
