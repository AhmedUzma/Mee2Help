package com.user.mee2help.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.google.android.material.textfield.TextInputLayout;
import com.user.mee2help.R;

public class RegisterActivity extends AppCompatActivity {

    TextInputLayout til_fname,til_lname,til_mobile,til_email,til_password,til_address;
    EditText edt_fname,edt_lname,edt_mobile,edt_email,edt_password,edt_address;
    RadioGroup rg_gender;
    Button btn_signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        init();
    }

    public void init(){
        til_fname = findViewById(R.id.til_fname);
        til_lname = findViewById(R.id.til_lname);
        til_mobile = findViewById(R.id.til_mobile);
        til_email = findViewById(R.id.til_email);
        til_password = findViewById(R.id.til_password);
        til_address = findViewById(R.id.til_address);

        edt_fname = findViewById(R.id.edt_fname);
        edt_lname = findViewById(R.id.edt_lname);
        edt_mobile = findViewById(R.id.edt_mobile);
        edt_email = findViewById(R.id.edt_email);
        edt_password = findViewById(R.id.edt_password);
        edt_address = findViewById(R.id.edt_address);

        rg_gender = findViewById(R.id.rg_gender);

        btn_signup = findViewById(R.id.btn_signup);
    }

    public void RegisterUser(){

    }
}
