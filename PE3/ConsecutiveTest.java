package com.PE3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConsecutiveTest {
    Consecutive obj;

    public ConsecutiveTest() {
    }

    @Before
    public void setUp() {
        this.obj = new Consecutive();
    }

    @After
    public void tearDown() {
        this.obj = null;
    }

    @Test
    public void CheckConsecutive() {
        String actualstr = this.obj.CheckConsecutive("1,2,3,4,5,6,7");
        String expectedstr = "consecutive";
        Assert.assertEquals(actualstr, expectedstr);
    }
}
