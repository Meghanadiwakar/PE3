
/*Create a class called StudentMarks, which prompts user for the number of students,
 * reads it from the keyboard, and saves it in an
 *  int variable called numOfStudents. It then prompts user for the
 *  grades of each of the students and saves them in an int array called stuGrades.
 *  Your program shall check that the grade is between 0 and 100 else has to trow an error message.
 */

package com.stackroute.PE3;

import org.junit.After;
import org.junit.Assert;
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
//test for success//
    @Test
    public void checkgradessuccess() {
        boolean actualStr = obj.check(new int[]{10,12,34,56});
        boolean expectedStr = true;
        Assert.assertEquals (actualStr,expectedStr);
    }

//test for failure//
    @Test
    public void checkgradesfailure() {
        boolean actualStr = obj.check(new int[]{10,120,34,56});
        boolean expectedStr = true;
        Assert.assertNotEquals(actualStr,expectedStr);
    }


}