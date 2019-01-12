/*Create a class called StudentMarks, which prompts user for the number of students,
* reads it from the keyboard, and saves it in an
*  int variable called numOfStudents. It then prompts user for the
*  grades of each of the students and saves them in an int array called stuGrades.
*  Your program shall check that the grade is between 0 and 100 else has to trow an error message.
 */

package com.stackroute.PE3;

public class StudentMarks {
    public boolean check(int[] marks) {

        int n = marks.length;
        int flag = 0;

        for (int i = 0; i < n; i++) {
            if (marks[i] < 0 || marks[i] > 100) {
                flag = 1;
            }
        }
        if (flag == 0) return true;
        else {
            return false;
        }
    }

}
