import java.util.*;

public class PascalTriangle {

    private void pascalTriangle(final Integer n){
        Integer[][] board = new Integer[n][n];

        for(int row = 0; row < n; row++){
            for(int col = 0;  col < row; col++){
                if(col == 0 || col == row-1){
                    board[row][col] = 1;
                }else{
                    board[row][col] = board[row-1][col-1] + board[row-1][col];
                }
            }
        }

        printBoard(board);
    }


    private  void printBoard(Integer[][] b){
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
                if(b[i][j] != null){
                    System.out.print(b[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String [] args) {
        new PascalTriangle().pascalTriangle(12);

    }
    
    
}
