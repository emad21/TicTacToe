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
        
}
