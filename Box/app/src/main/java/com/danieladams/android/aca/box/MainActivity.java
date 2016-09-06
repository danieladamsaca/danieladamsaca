package com.danieladams.android.aca.box;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        box bx = new box();
        bx.height = 50;
        bx.depth =20;
        bx.weight = 45;


        bx.showAttributes();

    }
}
