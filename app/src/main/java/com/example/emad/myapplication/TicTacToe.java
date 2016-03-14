package com.example.emad.myapplication;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
=======
>>>>>>> 2de25a7... Added button to start game,text view and option to choose between players
/**
 * Created by emad on 13/03/16.
 */
public class TicTacToe {
<<<<<<< HEAD
	   private char mBoard[];

        private static final int Board_size=9;

        public static final char H_Player= 'x';
        public static final  char A_Player='0';
        public static final char Empty_space=' ';

        List<Integer> availableTiles;
        private Random mRand;

        public static int getBoard_size(){
            return Board_size;
        }
        public TicTacToe(){
            mBoard = new char[Board_size];

            for (int i=0;i< Board_size ;i++ ) {
                mBoard[i]= Empty_space;
            }
            mRand = new Random();
        }

        public void clearBoard(){
            for (int i=0;i< Board_size ;i++ ) {
                mBoard[i]= Empty_space;
            }

        }

        public void setMove(char player, int location)
        {
            mBoard[location] = player;
        }

        public List<Integer> getAvailableStates(){
            availableTiles = new ArrayList<Integer>();
            for(int i=0;i<mBoard.length;i++){
                if(mBoard[i]== Empty_space){
                    availableTiles.add(i);
                }
            }
            return availableTiles;
        }
         int computersMove;
        public int minimax(int depth,char player) {
            // Base case, check for end state
            int rv = checkforwinner();
            if (rv == 3) {
                return +1;
            }
            if (rv == 2) {
                return -1;
            }

            List<Integer> availableTiles = getAvailableStates();
            if (availableTiles.isEmpty()) return 0;

            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for (int i = 0; i < availableTiles.size(); ++i) {
                int tile = availableTiles.get(i);

                if (player == A_Player) {
                    setMove(A_Player, tile);
                    int currentScore = minimax(depth + 1, H_Player);
                    max = Math.max(currentScore, max);
                    //if(depth==0)
                    if (currentScore >= 0) {
                        if (depth == 0) computersMove = tile;
                    }
                    if (currentScore == 1) {
                        mBoard[tile] = Empty_space;
                        break;
                    }
                    if (i == availableTiles.size() - 1 && max < 0) {
                        if (depth == 0) computersMove = tile;
                    }
                } else if (player == H_Player) {
                    setMove(H_Player, tile);
                    int currentScore = minimax(depth + 1, A_Player);
                    min = Math.min(currentScore, min);
                    if (min == -1) {
                        mBoard[tile] = Empty_space;
                        break;
                    }
                }
                mBoard[tile] = Empty_space; //Reset this point

            }
            return player == A_Player ? max : min;
        }




            public int checkforwinner(){
            // CHECK FOR ROWS
            for (int i=0;i<=6 ;i+=3 ) {
                if (mBoard[i] == H_Player &&
                        mBoard[i+1] == H_Player &&
                        mBoard[i+2] == H_Player ) {
                    return 2;
                }
                if (mBoard[i] == A_Player &&
                        mBoard[i+1] == A_Player &&
                        mBoard[i+2] == A_Player ) {
                    return 3;
                }

            }

            // CHECK FOR columns
            for (int i=0;i<=2 ;i++ ) {
                if (mBoard[i] == H_Player &&
                        mBoard[i+3] == H_Player &&
                        mBoard[i+6] == H_Player ) {
                    return 2;
                }
                if (mBoard[i] == A_Player &&
                        mBoard[i+3] == A_Player &&
                        mBoard[i+6] == A_Player) {
                    return 3;
                }

            }
            // for diagonals
          // for human player
            if ((mBoard[0] == H_Player &&
                    mBoard[4] == H_Player &&
                    mBoard[8] == H_Player)||
                    (mBoard[2] == H_Player &&
                            mBoard[4] == H_Player &&
                      mBoard[6] == H_Player)) {
                    return 2;
                }
           // for computer player
            if ((mBoard[0] == A_Player &&
                    mBoard[4] == A_Player &&
                    mBoard[8] == A_Player ) ||
                    (mBoard[2] == A_Player &&
                      mBoard[4] == A_Player &&
                     mBoard[6] == A_Player )) {
                    return 3;
                }

            // for tie
            for (int i=0;i< getBoard_size();i++){

                if(getAvailableStates().isEmpty()){
                    return  1;
                }
            }

            return 0;
        }
=======
        
>>>>>>> 2de25a7... Added button to start game,text view and option to choose between players
}
