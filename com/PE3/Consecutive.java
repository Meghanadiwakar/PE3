package com.PE3;
public class Consecutive {
    public String CheckConsecutive(String str){
        String [] intergers = str.split(",");
        int a= Integer.parseInt(intergers[0]);
        String match = a+","+(a+1)+","+(a+2)+","+(a+3)+","+(a+4)+","+(a+5)+","+(a+6);
        if (match.equals(str))
            return "consecutive";
            else
                return "non consecutive";

    }
}
