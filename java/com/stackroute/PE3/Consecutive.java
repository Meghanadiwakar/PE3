
/*Write a program to find out if a series of 7 digits
* are consecutive numbers. To make this easier,
* assume the digits are a string and use split()
 */
package com.stackroute.PE3;

public class Consecutive {
    public String CheckConsecutive(String str) {
        if (str != null) {
            String[] intergers = str.split(",");
            int a = Integer.parseInt(intergers[0]);
            String match = a + "," + (a + 1) + "," + (a + 2) + "," + (a + 3) + "," + (a + 4) + "," + (a + 5) + "," + (a + 6);
            if (match.equals(str))
                return "consecutive";
            else
                return "non consecutive";

        }
        return null;
    }
}
