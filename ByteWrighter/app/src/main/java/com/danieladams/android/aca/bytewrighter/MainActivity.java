package com.danieladams.android.aca.bytewrighter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int[] data = {71, 73, 70, 56, 57, 97, 13, 0, 12, 0, 145,
                0, 0, 255, 255, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 44,
                0, 0, 0, 0, 13, 0, 12, 0, 0, 2, 38, 132, 45, 121, 11,
                25, 175, 150, 120, 20, 162, 132, 51, 110, 106, 239, 22,
                8, 160, 56, 137, 96, 72, 77, 33, 130, 86, 37, 219, 182,};


        File outputFile = new File("/sdcard/pic.gif");
        FileOutputStream fos;

        try {
            fos = new FileOutputStream(outputFile);

            for (int i = 0; i < data.length; i++) {
                fos.write(data[i]);
            }
            fos.close();
        } catch (IOException e) {
            System.out.println("Error - " + e.getMessage());
        }

    }


    }


