package com.example.sqliteandroid;

import android.widget.EditText;

public class PersonInfo {
    private String first, middle, last, title, taluka, mobileno;
    public PersonInfo (){
        first = "";
        middle = "";
        last = "";
        title = "";
        taluka = "";
        mobileno = "";
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
                        EditText taluka, EditText mobileno) {
        first = validateField(fname);
        middle = validateField(mname);
        last = validateField(lname);
        this.title = validateField(title);
        this.taluka = validateField(taluka);
        this.mobileno = validateField(mobileno);
    }

    public String getFirst () {
        return first;
    }

    public String getMiddle () {
        return middle;
    }

    public String getLast () {
        return last;
    }

    public String getTitle () {
        return title;
    }

    public String getTaluka () {
        return taluka;
    }

    public String getMobileno () {
        return mobileno;
    }

    public String getInfo () {
        String value = title.equals("")?"": title;
        value += first.equals("")? "" : ". " + first;
        value += middle.equals("")? "" : " " + middle;
        value += last.equals("")? "" : " " + last;
        value += taluka.equals("")? "" : ", resides at " + taluka;
        value += mobileno.equals("")? "" : " having mobileno " + mobileno;

        return value;
    }
}
