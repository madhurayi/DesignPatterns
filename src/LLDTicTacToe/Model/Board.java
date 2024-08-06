package LLDTicTacToe.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Board {
    public int size;
    public PlayingPiece[][] board;
    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];

    }
    public boolean addPiece(int row,int column,PlayingPiece piece){
        if(board[row][column]!=null){
            return false;
        }
        board[row][column] = piece;
        return true;
    }
    public List<HashMap<Integer,Integer>> getFreeCells(){
        List<HashMap<Integer,Integer>> freeCells = new ArrayList<>();
        for(int row=0;row<size;row++){
            for(int column=0;column<size;column++){
                if(board[row][column]==null){
                    HashMap<Integer,Integer> rowColumn = new HashMap<>();
                    freeCells.add(rowColumn);
                }
            }
        }
        return freeCells;
    }
    public void printBoard(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if (board[i][j] != null) {
                    System.out.print(board[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");

            }
            System.out.println();
        }
    }
}
