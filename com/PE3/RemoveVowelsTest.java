package com.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels obj;
    @Before
    public void setUp() {
        obj = new RemoveVowels();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void VowelChecksuccess() {
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

            assertEquals(expectedList,obj.removeVowel(result));
        }

        @Test
    public void VowelCheckfailure() {
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

        assertNotEquals(expectedList,obj.removeVowel(result));
    }


}