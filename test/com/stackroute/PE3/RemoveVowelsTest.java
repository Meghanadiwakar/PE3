/*Write a program to set up an array of places, Loop round and remove the vowels.*
Display the new words in console
/
 */


package com.stackroute.PE3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels obj;

    @Before
    public void setUp() throws Exception {
        obj = new RemoveVowels();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }
//test for success//
    @Test
    public void removeVowelssuccess() {
        List<String> result = new ArrayList<>();
        result.add("India");
        result.add("United States");
        result.add("Germany");
        result.add("Egypt");
        result.add("czechoslovakia");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("Ind");
        expectedList.add("Untd Stts");
        expectedList.add("Grmny");
        expectedList.add("Egypt");
        expectedList.add("czchslvk");

        Assert.assertEquals(expectedList, obj.removeVowel(result));
    }
//test for failure//
    @Test
    public void removeVowelsFailure() {
        List<String> result = new ArrayList<>();
        result.add("India");
        result.add("United States");
        result.add("Germany");
        result.add("Egypt");
        result.add("czechoslovakia");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("India");
        expectedList.add("United States");
        expectedList.add("Germany");
        expectedList.add("Egypt");
        expectedList.add("czechoslovakia");

        Assert.assertNotEquals(expectedList, obj.removeVowel(result));
    }
//test for null//
    @Test
    public void removeVowelsnull() {
        List<String> result = new ArrayList<>();
        result.add("");


        List<String> expectedList = new ArrayList<>();
        expectedList.add(null);

        Assert.assertNotEquals(expectedList, obj.removeVowel(result));
    }

}