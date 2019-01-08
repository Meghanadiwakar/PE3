package com.PE3;

import java.util.Scanner;

public class ExceptionCreation {
    public void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String w=s.nextLine();
        try {
            System.out.println(w);
            throw new Exception("Creation of Exception");
        } catch (Exception e)
        {
            System.out.println("Caught");
//Print the message which is in exception object
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finally is always located after catch block");
        }
    }
}

