package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Calculator cal;
    Button b0, b4, b5, b6, b7, b8, b9, bPM, bDot, bRes, bAdd, bSub;
    TextView strRes;
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cal = new Calculator();
        strRes = (TextView)findViewById(R.id.textPanel);
        b0 = (Button)findViewById(R.id.button0);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);
        b7 = (Button)findViewById(R.id.button7);
        b8 = (Button)findViewById(R.id.button8);
        b9 = (Button)findViewById(R.id.button9);
        bPM = (Button)findViewById(R.id.buttonPM);
        bDot = (Button)findViewById(R.id.buttonDot);
        bAdd = (Button)findViewById(R.id.buttonAdd);
        bSub = (Button)findViewById(R.id.buttonSub);
        bRes = (Button)findViewById(R.id.buttonRes);

        View.OnClickListener doIt = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.buttonRes) {
                    strRes.setText(cal.getValue());
                }
                else {
                    Button b = (Button)findViewById(view.getId());
                    String clickVal = b.getText().toString();
                    cal.setTerm(clickVal);
                    Log.d(TAG, cal.getOps());
                    strRes.setText(cal.getEquation());
                }
            }
        };
        b0.setOnClickListener(doIt);
        b4.setOnClickListener(doIt);
        b5.setOnClickListener(doIt);
        b6.setOnClickListener(doIt);
        b7.setOnClickListener(doIt);
        b8.setOnClickListener(doIt);
        b9.setOnClickListener(doIt);
        bPM.setOnClickListener(doIt);
        bDot.setOnClickListener(doIt);
        bAdd.setOnClickListener(doIt);
        bSub.setOnClickListener(doIt);
        bRes.setOnClickListener(doIt);
    }
}