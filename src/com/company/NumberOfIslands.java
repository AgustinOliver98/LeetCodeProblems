package com.company;

public class NumberOfIslands {
    Utils safe = new Utils();
    private static int numberOfIslands(int[][] matrix) {
        if(matrix.length==0 && matrix[0].length==0) return 0;
        int islands=0;
        int row=0,col=0;
        for(row=0;row<matrix.length;row++){
            for(col=0;col<matrix[0].length;col++){
                if(matrix[row][col]==1){
                    dfs(matrix,row,col);
                    islands++;
                }
            }
        }
        return islands;
    }

    private static void dfs(int[][] matrix, int row, int col) {
        if(!Utils.safe(matrix,row,col)) return;

        matrix[row][col]=0;
        dfs(matrix,row-1,col);
        dfs(matrix,row,col+1);
        dfs(matrix,row,col-1);
        dfs(matrix,row+1,col);

    }

}
