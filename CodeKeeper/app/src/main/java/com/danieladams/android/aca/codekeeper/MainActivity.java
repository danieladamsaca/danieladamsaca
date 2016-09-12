package com.danieladams.android.aca.codekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {

    TextView mTextView2;
    TextView mEditText;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mEditText = (EditText) findViewById(R.id.editText);
        mTextView2 = (TextView) findViewById(R.id.textView2);
        mButton = (Button) findViewById(R.id.button);

        final String[] userStrings = new String[10];

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userCode;

                if (mEditText.getText().toString() != "") {
                    userCode = mEditText.getText().toString();
                    userStrings[0] = userCode;
                }

                CodeKeeper keeper = new CodeKeeper(userStrings);
            }
        });
    }

    public class CodeKeeper {
        ArrayList list;
        String[] codes = {"alpha", "lambda", "gamma", "delta", "zeta", "omega", "beta", "omicron"};

        public CodeKeeper(String[] userCodes) {
            list = new ArrayList();

            for (int i = 0; i < codes.length; i++) {
                addCode(codes[i]);
            }


            for (int j = 0; j < userCodes.length; j++) {
                addCode(userCodes[j]);
            }


            for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
                String output = (String) iterator.next();
                System.out.println(output);
                if (output != null) {
                    mTextView2.append(output + "\n");
                }
            }
        }

        private void addCode(String code) {
            if (!list.contains(code)) {
                list.add(code);
            }
        }
    }
}
