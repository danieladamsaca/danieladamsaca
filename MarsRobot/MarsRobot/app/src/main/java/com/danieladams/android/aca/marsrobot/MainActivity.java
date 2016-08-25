package com.danieladams.android.aca.marsrobot;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MarsRobot gravity = new MarsRobot();
        gravity.status = "exploring";
        gravity.speed = 2;
        gravity.temperature = -60;
        gravity.weight = 45;
        gravity.windspeed = 8;

        gravity.showAttributes();
        System.out.println("Increasing speed to 3.");
        gravity.speed = 3;
        gravity.showAttributes();
        System.out.println("Changing temperature to -60.");
        gravity.temperature = -60;
        gravity.showAttributes();
        System.out.println("Checking the temperature.");
        gravity.checkTemoerature();
        gravity.showAttributes();
        System.out.println("Changing weight to 85.");
        gravity.weight = 85;
        gravity.checkWeight();
        gravity.showAttributes();
        System.out.println("Changing windspeed to 12.");
        gravity.windspeed = 12;
        gravity.checkWindspeed();
        gravity.showAttributes();




    }



    }

