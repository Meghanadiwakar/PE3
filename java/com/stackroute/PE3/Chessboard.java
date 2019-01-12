/*Write a program to create a ChessBoard pattern with the
* help of multidimensional array, where
* WWrepresents white color and BB represents Black color.
 */
package com.stackroute.PE3;

public class Chessboard
{
    //this prints chess board pattern//
    public static void main(String args[]) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("WW|");
                else
                    System.out.print("BB|");
            }
            System.out.println();
        }
    }
}
