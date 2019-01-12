/*Create a class with a main( ) that throws an object of class Exception inside a try block.
  a. Give the constructor for Exception a String argument.
 b. Catch the exception inside a catch clause and print the String argument.
 c. Add a finally clause and print a message to prove you were there.
*/

package com.stackroute.PE3;

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


