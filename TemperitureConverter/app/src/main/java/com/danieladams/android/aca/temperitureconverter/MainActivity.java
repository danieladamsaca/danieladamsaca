package com.danieladams.android.aca.temperitureconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mFah;
    TextView moutputTextView;
    TextView mCel;
    Button mConvertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFah = (TextView) findViewById(R.id.Fah);
        mCel = (TextView) findViewById(R.id.Cel);
        moutputTextView = (TextView) findViewById(R.id.outputText);
        mConvertButton = (Button) findViewById(R.id.button);


        mConvertButton.setOnClickListener(new View.OnClickListener() {
            String currentFah;
            String convertedTemp;
            String currentCel;

            @Override
            public void onClick(View view) {


                if (!mFah.getText().toString().equals("")) {
                    currentFah = mFah.getText().toString();
                    float fahValue = Float.parseFloat(currentFah);

                    fahValue = fahValue - 32;
                    fahValue = fahValue / 9;
                    fahValue = fahValue * 5;

                    convertedTemp = String.valueOf(fahValue);

                    moutputTextView.setText(currentFah + " fahrenheit is " + convertedTemp + " celsius,");
                    mFah.setText("");

                    //mCel.setText(convertedTemp);

                } else if (!mCel.getText().toString() .equals("")) {
                    currentCel = mCel.getText().toString();
                    float celValue = Float.parseFloat(currentCel);

                    celValue = celValue * 9;
                    celValue = celValue / 5;
                    celValue = celValue + 32;

                    convertedTemp = String.valueOf(celValue);
                    //mFah.setText(convertedTemp);
                    moutputTextView.setText(currentCel + " celsius is " + convertedTemp +" fahrenheit,");
                    mCel.setText("");
                }






             /*   int fahValue = Integer.parseInt(currentFah);





                fahValue = fahValue - 32;
                fahValue = fahValue / 9;
                fahValue = fahValue * 5;

                convertedTemp = String.valueOf(fahValue);

                mCel.setText(convertedTemp); */
            }
        });


        mFah.getText();
        mCel.getText();


        float fah = 86;
        System.out.println(fah + " degrees Fahrenheit is ...");
        //to convert fahrenheit to celsius
        //begin by subtracting 32
        fah = fah - 32;
        //Divide the answer by 9
        fah = fah / 9;
        //multiply that answer by 5
        fah = fah * 5;
        System.out.println(fah + "degrees Celsius\n");

        float cel = 33;
        System.out.println(cel + "degrees Celsius is ...");
        //To convert Celsius to Fahrenheit
        //begin by multiplying by 9
        cel = cel * 9;
        //divide by 9
        cel = cel / 9;
        //Add 32 to answer
        cel = cel + 32;
        System.out.println(cel + " degrees Fahrenheit\n");

    }
}