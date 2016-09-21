package com.danieladams.android.aca.variables;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class VariableTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variable_test);




        byte a = 5;
        short b = 26;
        int c = 42;
        long d = 29000;
        boolean e = false;
        char f = 'q';
        float g = 4.8f;
        double h = 6.8;









            System.out.println("byte = 8 bits: " + a);
            System.out.println("short = 16 bits: " + b);
            System.out.println("int = 32 bits: " + c);
            System.out.println("long = 64 bits: " + d);
            System.out.println("boolean used for true or false: " + e);
            System.out.println("char: " + f);
            System.out.println("float can handle 1.4E-45 to 3.4E+38: " + g);
            System.out.println("double can handle 4.9E-324 to 1.7E+308: " + h);

    }




    }

