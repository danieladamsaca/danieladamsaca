package com.danieladams.android.aca.birthday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Birthday extends AppCompatActivity {


    public int day;
    public int month;
    public int year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);

        Birthday bday = new Birthday();

        bday.month = 04;
        bday.day = 27;
        bday.year = 1990;




        bday.show();
    }

    private void show() {
        System.out.println("BirthDay: " + month + "/" + day + "/" + year);
    }


}









