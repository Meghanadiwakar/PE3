package com.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveTest {
    Consecutive obj;
    @Before
    public void setUp() {
        obj = new Consecutive();

    }
    @After
    public void tearDown() {
        obj = null;
    }

    @Test
    public void CheckConsecutive () {
        String actualstr = obj.CheckConsecutive("1,2,3,4,5,6,7");
        String expectedstr= "consecutive";
        assertEquals(actualstr,expectedstr);

    }

}