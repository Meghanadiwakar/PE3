
/* Write a program to compute the addition of two matrix,
* Read the number of rows and columns
* as input, also the values of each matrix
 */
package com.stackroute.PE3;

import java.util.Arrays;

public class Matrixadd {

    public String add (int[][] firstMatrix,int[][] secondMatrix,int row,int column)
    {
        int[][] finalMatrix=new int[row][column];
        for(int i=0;i<row;i++)
            for (int j = 0; j < column; j++)
                finalMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
        String object= Arrays.deepToString(finalMatrix);
        return object;
    }
}
