package com.babyachievement.top100;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateImageTest {

    @Test
    public void rotate() {
        RotateImage rotateImage = new RotateImage();
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int n = matrix.length;
        rotateImage.rotate2(matrix);


        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }



        int [][]matrix2 = {
                { 5, 1, 9,11},
        { 2, 4, 8,10},
            {13, 3, 6, 7},
                {15,14,12,16}
        };
        n = matrix2.length;
        rotateImage.rotate(matrix2);


        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(matrix2[i][j] +" ");
            }
            System.out.println();
        }
    }
}