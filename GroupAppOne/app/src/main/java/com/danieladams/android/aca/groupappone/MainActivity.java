package com.danieladams.android.aca.groupappone;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void processClicks(View display){
        Intent action = null;
        int id = display.getId();

        switch (id){

            case  (R.id.imageButton3):
                action = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("geo: "
                                + ""));
                break;
            default:
                break;
        }
        startActivity(action);

    }
}
