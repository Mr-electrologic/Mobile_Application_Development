package com.example.card1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText title, fname, mname, lname, rollno, taluka, collegename;
    TextView textShowinfo;
    PersonInfo p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname = (EditText) findViewById(R.id.editFirst);
        mname = (EditText) findViewById(R.id.editMiddle);
        lname = (EditText) findViewById(R.id.editLast);
        title = (EditText) findViewById(R.id.editTitle);
        rollno = (EditText) findViewById(R.id.editRollno);
        taluka = (EditText) findViewById(R.id.editTaluka);
        collegename = (EditText) findViewById(R.id.editCollegename);
        textShowinfo = (TextView) findViewById(R.id.textInfo);
        Button button = (Button) findViewById(R.id.buttonPress);
        p = new PersonInfo();
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                p.setInfo(title, fname, mname, lname, taluka, rollno, collegename);
                textShowinfo.setText(p.getInfo());
            }
        });
    }
}