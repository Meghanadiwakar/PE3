/*Write a program that will generate exceptions of type NegativeArraySizeException,
* IndexOutOfBoundsException, NullPointerException.
* Record the catching of each exception by
* displaying the message stored in the exception object.
 */

package com.stackroute.PE3;

public class ExceptionWithBound {
    public static void main(String args[])
    {
        int result=0,arraySize=3,badSize = -1;
        int[] array = null;
        for(int choice = 0; choice<3 ; choice++)
            try {
                switch(choice)
                {
                    case 0: result = array[0];
                        break;
                    case 1: array = new int[badSize];
                        break;
                    case 2: array = new int[arraySize];
                        result = array[arraySize];
                        break;
                }
            } catch(NullPointerException e) {
                System.out.println("\nNullPointerException Exception caught. " +
                        "Message in NullPointerException is:\n" +
                        "\n" + e + "\n");
            } catch(NegativeArraySizeException e) {
                System.out.println("\nNegativeArraySizeException Exception caught. " +
                        "Message in NegativeArraySizeException is:\n" +
                        "\n" + e + "\n");
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("\nArrayIndexOutOfBoundsException Exception caught. " +
                        "Message in ArrayIndexOutOfBoundsException is:\n" +
                        "\n" + e + "\n");
            }
    }

}
