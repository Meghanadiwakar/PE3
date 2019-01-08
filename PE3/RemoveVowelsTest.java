package com.PE3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
}




