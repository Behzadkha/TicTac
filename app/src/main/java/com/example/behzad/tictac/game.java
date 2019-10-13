package com.example.behzad.tictac;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class game extends AppCompatActivity {
    private ImageButton one,two,three,four,five,six,seven,eight,nine;
    private int checker = 0;
    private String check1,check2,check3,check4,check5,check6,check7,check8,check9;
    private MediaPlayer sound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        one = findViewById(R.id.first);
        two = findViewById(R.id.second);
        three = findViewById(R.id.third);
        four = findViewById(R.id.forth);
        five = findViewById(R.id.fifth);
        six = findViewById(R.id.sixth);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);



        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checker % 2 == 0){
                    one.setImageResource(R.drawable.finalcross);
                    checker++;
                    check1 = "true";
                    one.setEnabled(false);
                }
                else{
                    one.setImageResource(R.drawable.finalcircle);
                    checker++;
                    check1 = "false";
                    one.setEnabled(false);
                }
                checkwinner();
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checker % 2 == 0){
                    two.setImageResource(R.drawable.finalcross);
                    checker++;
                    check2 = "true";
                    two.setEnabled(false);
                }
                else{
                    two.setImageResource(R.drawable.finalcircle);
                    checker++;
                    check2 = "false";
                    two.setEnabled(false);
                }
                checkwinner();
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checker % 2 == 0){
                    three.setImageResource(R.drawable.finalcross);
                    checker++;
                    check3 = "true";
                    three.setEnabled(false);
                }
                else{
                    three.setImageResource(R.drawable.finalcircle);
                    checker++;
                    check3 = "false";
                    three.setEnabled(false);
                }
                checkwinner();
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checker % 2 == 0){
                    four.setImageResource(R.drawable.finalcross);
                    checker++;
                    check4 = "true";
                    four.setEnabled(false);
                }
                else{
                    four.setImageResource(R.drawable.finalcircle);
                    checker++;
                    check4 = "false";
                    four.setEnabled(false);
                }
                checkwinner();
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checker % 2 == 0){
                    five.setImageResource(R.drawable.finalcross);
                    checker++;
                    check5 = "true";
                    five.setEnabled(false);
                }
                else{
                    five.setImageResource(R.drawable.finalcircle);
                    checker++;
                    check5 = "false";
                    five.setEnabled(false);
                }
                checkwinner();
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checker % 2 == 0){
                    six.setImageResource(R.drawable.finalcross);
                    checker++;
                    check6 = "true";
                    six.setEnabled(false);
                }
                else{
                    six.setImageResource(R.drawable.finalcircle);
                    checker++;
                    check6 = "false";
                    six.setEnabled(false);
                }
                checkwinner();
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checker % 2 == 0){
                    seven.setImageResource(R.drawable.finalcross);
                    checker++;
                    check7 = "true";
                    seven.setEnabled(false);
                }
                else{
                    seven.setImageResource(R.drawable.finalcircle);
                    checker++;
                    check7 = "false";
                    seven.setEnabled(false);
                }
                checkwinner();
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checker % 2 == 0){
                    eight.setImageResource(R.drawable.finalcross);
                    checker++;
                    check8 = "true";
                    eight.setEnabled(false);
                }
                else{
                    eight.setImageResource(R.drawable.finalcircle);
                    checker++;
                    check8 = "false";
                    eight.setEnabled(false);
                }
                checkwinner();
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checker % 2 == 0){
                    nine.setImageResource(R.drawable.finalcross);
                    checker++;
                    check9 = "true";
                    nine.setEnabled(false);
                }
                else{
                    nine.setImageResource(R.drawable.finalcircle);
                    checker++;
                    check9 = "false";
                    nine.setEnabled(false);
                }
                checkwinner();

            }
        });

    }
    public void checkwinner() {
        final MediaPlayer sound = MediaPlayer.create(this, R.raw.boom);
        final MediaPlayer winner = MediaPlayer.create(this, R.raw.winner);
        if (check1 == "true" && check2 == "true" && check3 == "true") {
            one.setBackgroundColor(0xFF00FF00);
            sound.start();
            Thread t = new Thread(){
                @Override
                public void run(){
                    try {
                        Thread.sleep(500);
                        two.setBackgroundColor(0xFF00FF00);
                        //sound.start();
                        Thread.sleep(500);
                        three.setBackgroundColor(0xFF00FF00);
                        //sound.start();
                        Thread.sleep(800);
                        sound.stop();
                        //setContentView(R.layout.winner);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                secondactivity();
                                winner.start();
                            }
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            };
            t.start();


        }
         else if (check1 == "false" && check2 == "false" && check3 == "false") {
            one.setBackgroundColor(0xFF00FF00);
            sound.start();
            Thread secondT = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
                        two.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(500);
                        three.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(800);
                        sound.stop();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                secondactivity();
                                winner.start();
                            }
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            secondT.start();
        }
        /////////////////////////////////////////////////////////////// 1,2,3
         else if (check1 == "true" && check4 == "true" && check7 == "true") {
            one.setBackgroundColor(0xFF00FF00);
            sound.start();
            Thread secondT = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
                        four.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(500);
                        seven.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(800);
                        sound.stop();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                secondactivity();
                                winner.start();
                            }
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            secondT.start();
        } else if (check1 == "false" && check4 == "false" && check7 == "false") {
            one.setBackgroundColor(0xFF00FF00);
            sound.start();
            Thread secondT = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
                        four.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(500);
                        seven.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(800);
                        sound.stop();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                secondactivity();
                                winner.start();
                            }
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            secondT.start();
        }
        /////////////////////////////////////////////////////////////////1,4,7
         else if (check1 == "true" && check5 == "true" && check9 == "true") {
            one.setBackgroundColor(0xFF00FF00);
            sound.start();
            Thread secondT = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
                        five.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(500);
                        nine.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(800);
                        sound.stop();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                secondactivity();
                                winner.start();
                            }
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            secondT.start();
        } else if (check1 == "false" && check5 == "false" && check9 == "false") {
            one.setBackgroundColor(0xFF00FF00);
            sound.start();
            Thread secondT = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
                        five.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(500);
                        nine.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(800);
                        sound.stop();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                secondactivity();
                                winner.start();
                            }
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            secondT.start();
        }
        //////////////////////////////////////////////////////////////////1,5,9
         else if (check2 == "true" && check5 == "true" && check8 == "true") {
            two.setBackgroundColor(0xFF00FF00);
            sound.start();
            Thread secondT = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
                        five.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(500);
                        eight.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(800);
                        sound.stop();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                secondactivity();
                                winner.start();
                            }
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            secondT.start();
        } else if (check2 == "false" && check5 == "false" && check8 == "false") {
            two.setBackgroundColor(0xFF00FF00);
            sound.start();
            Thread secondT = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
                        five.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(500);
                        eight.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(800);
                        sound.stop();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                secondactivity();
                                winner.start();
                            }
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            secondT.start();
        }
        /////////////////////////////////////////////////////////////////////
         else if (check3 == "true" && check5 == "true" && check7 == "true") {
            three.setBackgroundColor(0xFF00FF00);
            sound.start();
            Thread secondT = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
                        five.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(500);
                        seven.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(800);
                        sound.stop();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                secondactivity();
                                winner.start();
                            }
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            secondT.start();
        } else if (check3 == "false" && check5 == "false" && check7 == "false") {
            three.setBackgroundColor(0xFF00FF00);
            sound.start();
            Thread secondT = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
                        five.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(500);
                        seven.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(800);
                        sound.stop();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                secondactivity();
                                winner.start();
                            }
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            secondT.start();
        }
        //////////////////////////////////////////////////////////////////////
        else if (check3 == "true" && check6 == "true" && check9 == "true") {
            three.setBackgroundColor(0xFF00FF00);
            sound.start();
            Thread secondT = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
                        six.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(500);
                        nine.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(800);
                        sound.stop();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                secondactivity();
                                winner.start();
                            }
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            secondT.start();
        } else if (check3 == "false" && check6 == "false" && check9 == "false") {
            three.setBackgroundColor(0xFF00FF00);
            sound.start();
            Thread secondT = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
                        six.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(500);
                        nine.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(800);
                        sound.stop();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                setContentView(R.layout.winner);
                                winner.start();
                            }
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            secondT.start();
        }
        ////////////////////////////////////////////////////////////////////////
         else if (check4 == "true" && check5 == "true" && check6 == "true") {
            four.setBackgroundColor(0xFF00FF00);
            sound.start();
            Thread secondT = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
                        five.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(500);
                        six.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(800);
                        sound.stop();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                secondactivity();
                                winner.start();
                            }
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            secondT.start();
        } else if (check4 == "false" && check5 == "false" && check6 == "false") {
            four.setBackgroundColor(0xFF00FF00);
            sound.start();
            Thread secondT = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
                        five.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(500);
                        six.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(800);
                        sound.stop();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                secondactivity();
                                winner.start();
                            }
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            secondT.start();
        }
        ////////////////////////////////////////////////////////////////////
         else if (check7 == "true" && check8 == "true" && check9 == "true") {
            seven.setBackgroundColor(0xFF00FF00);
            sound.start();
            Thread secondT = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
                        eight.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(500);
                        nine.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(800);
                        sound.stop();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                secondactivity();
                                winner.start();
                            }
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            secondT.start();
        } else if (check7 == "false" && check8 == "false" && check9 == "false") {
            seven.setBackgroundColor(0xFF00FF00);
            sound.start();
            Thread secondT = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(500);
                        eight.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(500);
                        nine.setBackgroundColor(0xFF00FF00);
                        Thread.sleep(800);
                        sound.stop();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                secondactivity();
                                winner.start();
                            }
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            secondT.start();
        }
        else if(checker == 9){
            Intent i = new Intent(game.this, PopActivity.class);
            startActivity(i);

        }




    }

    public void secondactivity(){
        Intent intent = new Intent(game.this, winner.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
    }
}

