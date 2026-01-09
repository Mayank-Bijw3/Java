package backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class NQueens {

     public static void main(String[] args) {
       boolean[][] board = new boolean[4][4];
       List<List<String>> ans =new ArrayList<>();
       queen(board,0,ans);
       
       for(List<String> k:ans){
            System.out.println(k);
       }
    }
    
    public static void queen(boolean[][] board,int row,List<List<String>> ans){
        if(row==board.length){
            adding(board,ans);
            return;
        }
        for(int col=0;col<board.length;col++){
        if(isSafe(board,row,col)){
            board[row][col]=true;
            queen(board,row+1,ans);
            board[row][col]=false;
        }
        }
    }
    public static boolean isSafe(boolean[][] board,int row, int col){
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
        if (board[i][j]) {
            return false;
        }
    }

    // check diagonal right-up
    for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
        if (board[i][j]) {
            return false;
        }
    }
        
        return true;
    }
    public static void adding(boolean[][] board,List<List<String>> ans){
        ArrayList<String> temp = new ArrayList<>();
        
        for(boolean[] k :board){
            StringBuilder sb = new StringBuilder();
            for(boolean a:k){
                if(a){
                    sb.append("Q");
                }
                else{
                    sb.append(".");
                }
            }
            temp.add(sb.toString());
        }
        ans.add(temp);
        
        
        
    }  
}
