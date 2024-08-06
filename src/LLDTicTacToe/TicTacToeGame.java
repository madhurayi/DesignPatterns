package LLDTicTacToe;

import LLDTicTacToe.Model.*;

import java.util.*;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;
    TicTacToeGame() {
        initialize();
    }

    //create 2 players
    void initialize(){
        players = new LinkedList<>();
        PieceTypeO noughtsPiece= new PieceTypeO();
        Player player1 = new Player("Player1", noughtsPiece);

        PieceTypeX crossPiece= new PieceTypeX();
        Player player2 = new Player("Player2", crossPiece);

        players.add(player1);
        players.add(player2);

        //initializeBoard
        gameBoard= new Board(3);
    }
    public String startGame(){

        boolean isWinner=true;
        while(isWinner){
            //take out the player whose turn is and also put the same player in the list back
            Player player=players.removeFirst();

            //get the free space from the board
            gameBoard.printBoard();
            List<HashMap<Integer,Integer>> freeCells= gameBoard.getFreeCells();
            if(freeCells.isEmpty()){
                isWinner=false;
                continue;
            }

            //read the user input
            System.out.println("Player"+player.getPlayerName()+" Enter row,column: ");
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            String[] values = str.split(",");
            int inputRow= Integer.parseInt(values[0]);
            int inputColumn= Integer.parseInt(values[1]);

            //place the piece
            boolean pieceAddedSuccessfully=gameBoard.addPiece(inputRow,inputColumn, player.getPlayingPiece());
            if(!pieceAddedSuccessfully){
                //player can not insert piece into this cell, player has to choose another cell
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(player);
                continue;
            }
            players.addLast(player);
            boolean winner=isThereWinner(inputRow,inputColumn, player.getPlayingPiece());
            if(winner){
                return player.getPlayerName();
            }
        }

        return "tie";
    }

    public boolean isThereWinner(int inputRow, int inputColumn, PlayingPiece playingPiece){
        boolean rowMatch=true;
        boolean columnMatch=true;
        boolean diagonalMatch=true;
        boolean antiDiagonalMatch=true;

        //need to check in row
        for(int i=0;i<gameBoard.size;i++){
            if(gameBoard.board[inputRow][i]==null || gameBoard.board[inputRow][i]!=playingPiece){
                rowMatch=false;
            }
        }

        //need to check in column
        for(int i=0;i<gameBoard.size;i++){
            if(gameBoard.board[i][inputColumn]==null || gameBoard.board[i][inputColumn]!=playingPiece){
                columnMatch=false;
            }
        }

        //need to check in diagnols
        for(int i=0,j=0;i<gameBoard.size;i++,j++){
            if(gameBoard.board[i][j]==null || gameBoard.board[i][j]!=playingPiece){
                diagonalMatch=false;
            }
        }

        //need to check in anti diagnols
        for(int i=0,j=gameBoard.size-1;i<gameBoard.size;i++,j--){
            if(gameBoard.board[i][j]==null || gameBoard.board[i][j]!=playingPiece){
                antiDiagonalMatch=false;
            }
        }
        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
