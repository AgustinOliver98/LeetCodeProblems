package com.company;

public class Utils {

    public static boolean safe(int[][] matrix, int row, int col) {
        if(row<0 || row>matrix.length-1 || col< 0 || col>matrix[0].length-1 || matrix[row][col]==0){
            return false;
        }
        return true;
    }
}
