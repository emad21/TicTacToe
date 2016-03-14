package com.example.emad.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
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


   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        tgame = new TicTacToe();
    }


       
    


  










