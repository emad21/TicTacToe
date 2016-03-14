package com.example.emad.myapplication;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * Created by emad on 13/03/16.
 */
public class TicTacToe {
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
            //right diagonal
             for (int i=0;; ) {
                if (mBoard[i] == H_Player &&
                        mBoard[i+4] == H_Player &&
                        mBoard[i+8] == H_Player ) {
                    return 2;
                }
                if (mBoard[i] == A_Player &&
                        mBoard[i+4] == A_Player &&
                        mBoard[i+8] == A_Player) {
                    return 3;
                }

            }
             //left diagonal
             for (int i=2;; ) {
                if (mBoard[i] == H_Player &&
                        mBoard[i+2] == H_Player &&
                        mBoard[i+2] == H_Player ) {
                    return 2;
                }
                if (mBoard[i] == A_Player &&
                        mBoard[i+2] == A_Player &&
                        mBoard[i+2] == A_Player) {
                    return 3;
                }

            }
           
            // for tie
            for (int i=0;i< getBoard_size();i++){

                if(mBoard[i] != H_Player && mBoard[i] != A_Player && mBoard[i] != Empty_space){
                    return  1;
                }
            }

            return 0;
        }
        
}
