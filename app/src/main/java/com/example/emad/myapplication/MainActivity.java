package com.example.emad.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
<<<<<<< HEAD
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.graphics.Color;


public class MainActivity extends AppCompatActivity {
	private TicTacToe tgame;
    private Button tboardButtons[];
    private Button stbutton;
    private TextView tv;

    private TextView InfoTextView;

    private RadioButton humanC;
    private RadioButton compC;

    private int board_size =9;

    private boolean humanFirst = false;
    private boolean compFirst = false;
    private boolean tGameOver = false;
=======


public class MainActivity extends AppCompatActivity {
>>>>>>> 2de25a7... Added button to start game,text view and option to choose between players


   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
          tboardButtons = new Button[board_size];
        tboardButtons[0] = (Button) findViewById(R.id.a1);
        tboardButtons[1] = (Button) findViewById(R.id.a2);
        tboardButtons[2] = (Button) findViewById(R.id.a3);
        tboardButtons[3] = (Button) findViewById(R.id.a4);
        tboardButtons[4] = (Button) findViewById(R.id.a5);
        tboardButtons[5] = (Button) findViewById(R.id.a6);
        tboardButtons[6] = (Button) findViewById(R.id.a7);
        tboardButtons[7] = (Button) findViewById(R.id.a8);
        tboardButtons[8] = (Button) findViewById(R.id.a9);
        stbutton = (Button) findViewById(R.id.a10);

        humanC = (RadioButton)findViewById(R.id.rd1);
        compC = (RadioButton)findViewById(R.id.rb2);

        InfoTextView = (TextView) findViewById(R.id.tv1);

<<<<<<< HEAD
        tgame = new TicTacToe(); //initialize the game class
=======
        tgame = new TicTacToe();
>>>>>>> a04ff19bebdfb6da1693aa71d522670676da0183
    }
     //sets the position of player on board
     private void setMove(char player, int location) {
        tgame.setMove(player, location);
        tboardButtons[location].setEnabled(false);
        tboardButtons[location].setText(String.valueOf(player));
        if (player == tgame.H_Player) {
            tboardButtons[location].setTextColor(Color.GREEN);
        } else {
            tboardButtons[location].setTextColor(Color.RED);

        }

    }
     //computes minimax first and gets the computermove from it.
      private void getComputerMove() {
        tgame.minimax(0, tgame.A_Player);
        setMove(tgame.A_Player, tgame.computersMove);
    }


      //checks which player will play first. 
     public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rd1:
                if (checked)
                    humanFirst = true;
                    compFirst = false;
                    compC.setChecked(false);
                break;
            case R.id.rb2:
                if (checked)
                    humanFirst = false;
                    compFirst = true;
                    humanC.setChecked(false);
                break;
        }
    }

<<<<<<< HEAD
     public void startNewGame(View view) {  //works when user clicks the startNewGame button
        tgame.clearBoard();     //clears the game board in java class

        for (int i = 0; i < tboardButtons.length; i++) { 
        //clears the buttons that are displayed at interface
=======
     public void startNewGame(View view) {
        tgame.clearBoard();

        for (int i = 0; i < tboardButtons.length; i++) {
>>>>>>> a04ff19bebdfb6da1693aa71d522670676da0183

            tboardButtons[i].setText(" ");
            tboardButtons[i].setEnabled(true);
            tboardButtons[i].setOnClickListener(new ButtonClickListener(i));

        }

      if (humanFirst) {
            InfoTextView.setText(R.string.human_first);
           // humanFirst = false;
        } else if(compFirst) {
                InfoTextView.setText(R.string.turn_computer);
                getComputerMove();

            }
        else
            InfoTextView.setText(R.string.play);
    }
<<<<<<< HEAD
     //when any button is clicked
      private class ButtonClickListener implements View.OnClickListener {
        int location;
          //gets the position of that button
=======

      private class ButtonClickListener implements View.OnClickListener {
        int location;

>>>>>>> a04ff19bebdfb6da1693aa71d522670676da0183
        public ButtonClickListener(int location) {
            this.location = location;
        }

        public void onClick(View view) {
            if (!tGameOver) {
                if (tboardButtons[location].isEnabled()) {
                    setMove(tgame.H_Player, location);
                    int winner = tgame.checkforwinner();
                    if (winner == 0) {
                        InfoTextView.setText(R.string.turn_computer);
                        
                        getComputerMove();
                        winner = tgame.checkforwinner();
                    }
                    if (winner == 0) {
                        InfoTextView.setText(R.string.human_first);
                    } else if (winner == 1) {
                        InfoTextView.setText(R.string.result_tie);

                        tGameOver = true;
                    } else if (winner == 2) {
                        InfoTextView.setText(R.string.result_human_wins);

                        tGameOver = true;
                    } else {
                        InfoTextView.setText(R.string.result_computer_wins);

                        tGameOver = true;
                    }

                }
            }
        }
    }
}


=======

       
    }

>>>>>>> 2de25a7... Added button to start game,text view and option to choose between players

  










