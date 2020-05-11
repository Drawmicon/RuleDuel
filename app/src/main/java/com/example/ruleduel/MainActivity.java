package com.example.ruleduel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    Button rock, paper, scissors;
    TextView score, garyName, playerName;
    ImageView me, ewe;

    /*
    int ruleCheck(int sitch, int player, int rival)
    {
        //win = 1 fail = -1 tie = 0
        int result = 0;
        switch(sitch)
        {
            case 0:
                // code block
                break;
            case 1:
                // code block
                break;
            default:
        }
        return result;
    }
    */

    //timer
    final CountDownTimer timer = new CountDownTimer(20000, 1000) {
        @Override
        public void onTick(long millisUntilFinished) {
            //during every second
            //textView1.setText("Time Left: "+seconds+" s");
        }

        //When the timer runs out
        @Override
        public void onFinish() {
            //
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find all objects and attach to variables
        rock = findViewById(R.id.rock);
        paper = findViewById(R.id.paper);
        scissors = findViewById(R.id.scissors);

        score = findViewById(R.id.score);
        garyName = findViewById(R.id.rivalName);
        playerName = findViewById(R.id.playerName);

        me = findViewById(R.id.playerPick);
        ewe = findViewById(R.id.garysGarrison);

        //buttons

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //When rock is clicked
                //if()
                me.setImageResource(R.drawable.rock);

            }
        });


        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //When paper is clicked
                me.setImageResource(R.drawable.paper);
            }
        });

        scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //When scissors is clicked
                me.setImageResource(R.drawable.scissors);
            }
        });


    }


}
