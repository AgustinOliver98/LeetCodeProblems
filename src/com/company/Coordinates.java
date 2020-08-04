package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coordinates {
    static List<List<Integer>> CoOrdinates= new ArrayList<>();
    static List<Integer> points= new ArrayList<>();

    public static void CoOrdinates(int[][] arr, int[] x, int[] y) {
        int colStart=0, colEnd=0;
        for(int row=x[0];row<=y[0];row++){
            if(row==x[0]){
                colStart=x[1];
            }else{
                colStart=0;
            }
            if(row==x[1]){
                colEnd=y[1];
            }else{
                colEnd=arr.length-1;
            }

            for(int col=colStart;col<=colEnd;col++){
                CoOrdinates.add(Arrays.asList(row,col));
                points.add(arr[row][col]);
            }
        }
    }
}
