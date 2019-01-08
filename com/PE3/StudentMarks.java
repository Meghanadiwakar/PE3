package com.PE3;
import java.util.List;
import java.util.Scanner;
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



