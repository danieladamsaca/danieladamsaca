package com.danieladams.android.aca.widgetexploration;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exploration_layout);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        RadioButton rbBeijing = (RadioButton) findViewById (R.id.radioButtonBeijing);
        RadioButton rbLondon = (RadioButton) findViewById (R.id.radioButtonLondon);
        RadioButton rbNewYork = (RadioButton) findViewById (R.id.radioButtonNewYork);
        final EditText editText = (EditText) findViewById(R.id.editText);
        final Button button = (Button) findViewById(R.id.button);
        final TextClock tClock = (TextClock) findViewById(R.id.textClock);
        final CheckBox cbTransparency = (CheckBox) findViewById (R.id.checkBoxTransparency);
        final CheckBox cbTint = (CheckBox) findViewById(R.id.checkBoxTint);
        final CheckBox cbReSize = (CheckBox) findViewById (R.id.checkBoxReSize);

        final ImageView imageView = (ImageView) findViewById(R.id.imageView);

        Switch switch1 = (Switch) findViewById(R.id.switch1);
        final WebView webView = (WebView) findViewById(R.id.webView);


    }
}
