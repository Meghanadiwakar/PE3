/* Write a program to compute the addition of two matrix,
 * Read the number of rows and columns
 * as input, also the values of each matrix
 */


package com.stackroute.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixaddTest {
    Matrixadd matrixObject;

    @Before
    public void setUp() throws Exception {
        matrixObject = new Matrixadd();
    }

    @After
    public void tearDown() throws Exception {
        matrixObject = null;
    }
//test for success//
    @Test
    public void additionSuccess() {
        int[][] firstMatrix = {{1, 2}, {3, 4}, {5, 6}};
        int[][] secondMatrix = {{9, 8}, {7, 6}, {5, 4}};
        String expectedFinal = "[[10, 10], [10, 10], [10, 10]]";
        assertEquals(expectedFinal, matrixObject.add(firstMatrix, secondMatrix, 3, 2));
    }
//test for failure//
    @Test
    public void additionFailure() {
        int[][] firstMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] secondMatrix = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        String expectedFinal = "[[5 10, 10], [10, 8, 10], [10, 11, 10]]";
        assertNotEquals(expectedFinal, matrixObject.add(firstMatrix, secondMatrix, 3, 3));
    }

}