package com.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks obj;
    @Before
    public void setUp()  {
        obj = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void checkgradessuccess() {
        boolean actualStr = obj.check(new int[]{10,12,34,56});
        boolean expectedStr = true;
        assertEquals(actualStr,expectedStr);
    }


    @Test
    public void checkgradesfailure() {
        boolean actualStr = obj.check(new int[]{10,120,34,56});
        boolean expectedStr = true;
        assertNotEquals(actualStr,expectedStr);
    }

}