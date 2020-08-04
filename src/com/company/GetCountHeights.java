package com.company;

import java.util.*;

public class GetCountHeights {

    public int getCount(int[] heights) {
        int [] copy = new int [heights.length];
        int idx=0;
        for(int a : heights){
            copy[idx]=a;
            idx++;
        }
        int count = 0;
        Arrays.sort(copy);
        for(int i = 0; i< heights.length; i++){
            if(copy[i]!= heights[i]) count++;
        }
        return count;
    }

}

