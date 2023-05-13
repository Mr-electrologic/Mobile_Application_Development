package com.example.sqliteandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText title, fname, mname, lname, taluka, mobileno;
    PersonInfo p;
    DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname = (EditText) findViewById(R.id.editFirst);
        mname = (EditText) findViewById(R.id.editMiddle);
        lname = (EditText) findViewById(R.id.editLast);
        title = (EditText) findViewById(R.id.editTitle);
        taluka = (EditText) findViewById(R.id.editTaluka);
        mobileno = (EditText) findViewById(R.id.editMobileno);
        Button button = (Button) findViewById(R.id.buttonAdd);
        // creating a new dbhandler class
        // and passing our context to it.
        dbHandler = new DBHandler(MainActivity.this);
        p = new PersonInfo();
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                p.setInfo(title, fname, mname, lname, taluka, mobileno);
                // on below line we are calling a method to add new
                // course to sqlite data and pass all our values to it.
                dbHandler.addNewContact(p.getFirst(), p.getMiddle(), p.getLast(), p.getTitle(), p.getTaluka(), p.getMobileno());

                // after adding the data we are displaying a toast message.
                Toast.makeText(MainActivity.this, "Contact has been added.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
