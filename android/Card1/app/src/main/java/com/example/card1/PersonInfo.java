package com.example.card1;

import android.widget.EditText;

public class PersonInfo {
    private String first, middle, last, title, taluka, rollno, collegename;
    public PersonInfo (){
        first = "";
        middle = "";
        last = "";
        title = "";
        taluka = "";
        rollno = "";
        collegename = "";
    }

    private String validateField(EditText fieldName) {
        String value = "";
        try {
            value = fieldName.getText().toString();
        }
        catch (Exception ex) {
            value = "";
        }
        return value;
    }

    public void setInfo(EditText title, EditText fname, EditText mname, EditText lname,
                        EditText taluka, EditText rollno, EditText collegename) {
        first = validateField(fname);
        middle = validateField(mname);
        last = validateField(lname);
        this.title = validateField(title);
        this.taluka = validateField(taluka);
        this.rollno = validateField(rollno);
        this.collegename = validateField(collegename);
    }

    public String getInfo () {
        String value = title.equals("")?"": title;
        value += first.equals("")? "" : ". " + first;
        value += middle.equals("")? "" : " " + middle;
        value += last.equals("")? "" : " " + last;
        value += taluka.equals("")? "" : ", resides at " + taluka;
        value += rollno.equals("")? "" : " having rollno " + rollno;
        value += collegename.equals("")? "" : " studies in the college " + collegename;

        return value;
    }
}
