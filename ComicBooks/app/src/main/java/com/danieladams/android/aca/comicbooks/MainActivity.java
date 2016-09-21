package com.danieladams.android.aca.comicbooks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    TextView mTextView;
    TextView mEditText;
    Button mButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = (EditText) findViewById(R.id.editText);
        mTextView = (TextView) findViewById(R.id.textView);
        mButton = (Button) findViewById(R.id.button);


        


        HashMap quality = new HashMap();

        float price1 = 3.00F;
        quality.put("mint", price1);

        float price2 = 2.00F;
        quality.put("near mint", price2);

        float price3 = 1.50F;
        quality.put("very fine", price3);

        float price4 = 1.00F;
        quality.put("fine", price4);

        float price5 = 0.50F;
        quality.put("good", price5);

        float price6 = 0.25F;
        quality.put("poor", price6);


        comic[] comix = new comic[3];

        comix[0] = new comic("Amazing Spider-Man", "1A", "very fine", 12_000.00F);
        comix[0].setPrice((Float) quality.get(comix[0].condition));

        comix[1] = new comic("The Incredible Hulk", "181", "near mint", 680.00F);
        comix[1].setPrice((Float) quality.get(comix[1].condition));

        comix[2] = new comic("Cerebus", "1A", "good", 190.00F);
        comix[2].setPrice((Float) quality.get(comix[2].condition));

        for (int i = 0; i < comix.length; i++){
            System.out.println("Title: " + comix[i].title);
            System.out.println("Issue: " + comix[i].issueNumber);
            System.out.println("Condition: " + comix[i].condition);
            System.out.println("Price: $" + comix[i].price + "\n");

        }
    }

    class comic {
        String title;
        String issueNumber;
        String condition;
        float basePrice;
        float price;

        comic (String inTitle, String inIssueNumber, String inCondition, float inBasePrice){
            title = inTitle;
            issueNumber = inIssueNumber;
            condition = inCondition;
            basePrice = inBasePrice;

        }
        void setPrice(float factor){
            price = basePrice * factor;
        }
    }
}
