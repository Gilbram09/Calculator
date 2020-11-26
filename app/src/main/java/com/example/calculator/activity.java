package com.example.calculator;


import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);


        final int WelcomeScreenDisplay = 3000;
        Thread WelcomeThread = new Thread() {

            int wait = 0;
            @Override
            public void run (){
                try {
                    super.run();
                    while (wait< WelcomeScreenDisplay) {
                        sleep(100);
                        wait +=100;
                    }
                } catch (Exception e) {
                    System.out.println("EXc=" + e);


                }finally {
                    Intent intent= new Intent(activity.this,MainActivity.class);
                    finish();
                    startActivity(intent);

                }
            }
        };
        WelcomeThread.start();
    }
}

