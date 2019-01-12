/*Write a program to find out if a series of 7 digits
 * are consecutive numbers. To make this easier,
 * assume the digits are a string and use split()
 */

package com.stackroute.PE3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
//test for success//
    @Test
    public void CheckConsecutivessuceess() {
        String actualstr = this.obj.CheckConsecutive("1,2,3,4,5,6,7");
        String expectedstr = "consecutive";
        Assert.assertEquals(actualstr, expectedstr);
    }
    //test for failure//
    @Test
    public void CheckConsecutivefailure() {
        String actualstr = this.obj.CheckConsecutive("4,7");
        String expectedstr = "non consecutive";
        Assert.assertEquals(actualstr, expectedstr);
    }
//test for null value//
    @Test
    public void CheckConsecutivenull() {
        String actualstr = this.obj.CheckConsecutive("");
        String expectedstr = null;
        Assert.assertEquals(actualstr, expectedstr);
    }


}